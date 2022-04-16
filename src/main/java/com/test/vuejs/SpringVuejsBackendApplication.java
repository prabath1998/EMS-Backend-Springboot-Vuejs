package com.test.vuejs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.test.vuejs.entity.Employee;
import com.test.vuejs.repository.EmployeeRepository;

@SpringBootApplication
public class SpringVuejsBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringVuejsBackendApplication.class, args);
	}
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public void run(String... args) throws Exception {
		Employee employee1 = Employee.builder()
				.firstName("prabath")
				.lastName("udayanga")
				.email("praba@gmail.com")
				.build();
		
		Employee employee2 = Employee.builder()
				.firstName("dilan")
				.lastName("madumal")
				.email("dila@gmail.com")
				.build();
		
		Employee employee3 = Employee.builder()
				.firstName("janaka")
				.lastName("chathuranga")
				.email("jana@gmail.com")
				.build();
		
		employeeRepository.save(employee1);
		employeeRepository.save(employee2);
		employeeRepository.save(employee3);
	}

}
