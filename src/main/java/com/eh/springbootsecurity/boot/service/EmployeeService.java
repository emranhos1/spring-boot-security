package com.eh.springbootsecurity.boot.service;

import java.util.List;

import com.eh.springbootsecurity.boot.entity.Employee;


public interface EmployeeService {

	public Employee insertEmployee(Employee e);
	public Employee updateEmployee(int id,Employee e);
	public Employee insertOrUpdateEmployee(Employee e);
	public boolean deleteEmployee(int id);
	
	public List<Employee> selectEmployee();
	public Employee selectEmployeeById(int id);
	public List<Employee> selectPatientByCriteria(Employee employee);
}