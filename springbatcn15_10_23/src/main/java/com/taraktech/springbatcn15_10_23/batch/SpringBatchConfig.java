package com.taraktech.springbatcn15_10_23.batch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.ItemReader;
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

import com.taraktech.springbatcn15_10_23.dao.EmployeeDao;
import com.taraktech.springbatcn15_10_23.entity.Employee;
import com.taraktech.springbatcn15_10_23.processor.EmployeeDataProcessor;



@Configuration
public class SpringBatchConfig {
	@Autowired
	private EmployeeDao employeeDao;
	@Autowired
	private JobRepository jobRepository;
	@Autowired
	private PlatformTransactionManager platformTransactionManager;
	
	@Bean
	public ItemReader<Employee> itemReader(){
		FlatFileItemReader<Employee> itemReader = new FlatFileItemReader<>();
		itemReader.setResource(new FileSystemResource("E:\\Durgasoft\\file_example_XLSX_5000.csv"));
		itemReader.setLinesToSkip(1);
		itemReader.setLineMapper(lineMapper());
		return null;
	}
	
	private LineMapper<Employee> lineMapper() {
		DefaultLineMapper<Employee> lineMapper = new DefaultLineMapper<>();
		DelimitedLineTokenizer delimitedLineTokenizer = new DelimitedLineTokenizer();
		delimitedLineTokenizer.setDelimiter(",");
		delimitedLineTokenizer.setNames("fname","lname","gender","country","age","date","empid");
		delimitedLineTokenizer.setStrict(false);
		BeanWrapperFieldSetMapper<Employee> beanWrapperFieldSetMapper = new BeanWrapperFieldSetMapper<>();
		beanWrapperFieldSetMapper.setTargetType(Employee.class);
		lineMapper.setLineTokenizer(delimitedLineTokenizer);
		lineMapper.setFieldSetMapper(beanWrapperFieldSetMapper);
		return lineMapper;
	}

	public EmployeeDataProcessor itemProcessor() {
		return new EmployeeDataProcessor();
	}
	
	@Bean
	public RepositoryItemWriter<Employee> itemWriter(){
		RepositoryItemWriter<Employee> itemWriter = new RepositoryItemWriter<>();
		itemWriter.setRepository(employeeDao);
		itemWriter.setMethodName("save");
		return itemWriter;
	}
	@Bean
	public Step employeeJob() {
		return new StepBuilder("employeeStep", jobRepository)
				.<Employee,Employee>chunk(10, platformTransactionManager)
				.writer(itemWriter())
				.processor(itemProcessor())
				.reader(itemReader())
				.build();
	}
	@Bean
	public Job runJob() {
		return new JobBuilder("csv-job", jobRepository)
				.flow(employeeJob())
				.end()
				.build();
	}
}
