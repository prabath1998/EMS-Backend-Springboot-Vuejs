package com.test.vuejs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.vuejs.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
