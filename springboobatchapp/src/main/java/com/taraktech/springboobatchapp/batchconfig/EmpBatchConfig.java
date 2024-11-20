package com.taraktech.springboobatchapp.batchconfig;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.data.RepositoryItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.transaction.PlatformTransactionManager;

import com.taraktech.springboobatchapp.entity.Employee;
import com.taraktech.springboobatchapp.processor.EmployeeDataProcessor;
import com.taraktech.springboobatchapp.repository.EmployeeRepository;

@Configuration
public class EmpBatchConfig {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private JobRepository jobRepository;
	@Autowired
	private PlatformTransactionManager platformTransactionManager;
	
	@Bean
	public FlatFileItemReader<Employee> itemReader(){
		FlatFileItemReader<Employee> flatFileItemReader = new FlatFileItemReader<>();
		flatFileItemReader.setResource(new FileSystemResource("E:\\Durgasoft\\file_example_XLSX_5000.csv"));
		flatFileItemReader.setLinesToSkip(1);
		flatFileItemReader.setLineMapper(lineMapper());
		return flatFileItemReader;
	}
	
	private LineMapper<Employee> lineMapper() {
		
		DefaultLineMapper<Employee> lineMapper = new DefaultLineMapper<>();
		DelimitedLineTokenizer delimitedLineTokenizer = new DelimitedLineTokenizer();
		delimitedLineTokenizer.setDelimiter(",");
		delimitedLineTokenizer.setStrict(false);
		delimitedLineTokenizer.setNames("first_name","last_name","gender","country","age","date","emp_id");
		BeanWrapperFieldSetMapper<Employee> beanWrapperFieldSetMapper = new BeanWrapperFieldSetMapper<>();
		beanWrapperFieldSetMapper.setTargetType(Employee.class);
		lineMapper.setLineTokenizer(delimitedLineTokenizer);
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
		return new JobBuilder("csv-job", jobRepository)
				.flow(employeeStep(jobRepository, platformTransactionManager))
				.end()
				.build();
	}
}
