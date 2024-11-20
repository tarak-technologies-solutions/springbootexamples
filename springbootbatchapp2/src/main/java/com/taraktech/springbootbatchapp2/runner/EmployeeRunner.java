package com.taraktech.springbootbatchapp2.runner;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class EmployeeRunner implements CommandLineRunner {
	@Autowired
	private JobLauncher jobLauncher;
	@Autowired
	private Job job;

	@Override
	public void run(String... args) throws Exception {
		JobParameters jobParameters = new JobParametersBuilder()
				.addLong("startAt", System.currentTimeMillis())
				.toJobParameters();
		jobLauncher.run(job, jobParameters);
		System.out.println("CSV data stored into the database.......");	
	}

}
