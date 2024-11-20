package com.taraktech.springbootbatch.batchconfig;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.data.RepositoryItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.FlatFileItemWriter;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.transaction.PlatformTransactionManager;

import com.taraktech.springbootbatch.entity.Employee;
import com.taraktech.springbootbatch.processor.EmployeeDataProcessor;
import com.taraktech.springbootbatch.repository.EmployeeRepository;

@Configuration
public class SpringBatchConfig {
	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private JobRepository jobRepository;
	@Autowired
	private PlatformTransactionManager platformTransactionManager;
	
	@Bean
	public FlatFileItemReader<Employee> itemReader(){
		FlatFileItemReader<Employee> itemReader = new FlatFileItemReader<>();
		itemReader.setResource(new FileSystemResource("E:\\Durgasoft\\file_example_XLSX_5000.csv"));
		itemReader.setLinesToSkip(1);
		itemReader.setLineMapper(lineMapper());
		return itemReader;
	}
	
	private LineMapper<Employee> lineMapper() {
		DefaultLineMapper<Employee> lineMapper = new DefaultLineMapper<>();
		DelimitedLineTokenizer lineTokenizer = new DelimitedLineTokenizer();
		lineTokenizer.setDelimiter(",");
		lineTokenizer.setStrict(false);
		lineTokenizer.setNames("first_name","last_name","gender","country","age","date","emp_id");
		BeanWrapperFieldSetMapper<Employee> beanWrapperFieldSetMapper = new BeanWrapperFieldSetMapper<>();
		beanWrapperFieldSetMapper.setTargetType(Employee.class);
		lineMapper.setLineTokenizer(lineTokenizer);
		lineMapper.setFieldSetMapper(beanWrapperFieldSetMapper);
		return lineMapper;
	}

	public EmployeeDataProcessor itemProcessor() {
		return new EmployeeDataProcessor();
		
	}
	
	public RepositoryItemWriter<Employee> itemWriter(){
		RepositoryItemWriter<Employee> repositoryItemWriter = new RepositoryItemWriter<>();
		repositoryItemWriter.setRepository(employeeRepository);
		repositoryItemWriter.setMethodName("save");
		return repositoryItemWriter;
	}
	@Bean
	public Step employeeStep(JobRepository jobRepository,PlatformTransactionManager platformTransactionManager) {
		return new StepBuilder("employeeStep", jobRepository)
		.<Employee,Employee>chunk(10, platformTransactionManager)
		.reader(itemReader())
		.processor(itemProcessor())
		.writer(itemWriter())
		.build();
	}
	@Bean
	public Job runJob(JobRepository jobRepository) {
		return new JobBuilder("csv-job",jobRepository)
				.flow(employeeStep(jobRepository, platformTransactionManager))
				.end()
				.build();
	}
}


