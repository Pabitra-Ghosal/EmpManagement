package com.example.service;

import java.util.List;

import com.example.entity.Employee;

public interface EmployeeService {
	
	public Employee addEmployee(Employee emp);
	public void deleteEmployee(int id);
	public Employee updateEmployee(Employee emp);
	public List<Employee> getAllEmployees();
	public Employee getEmployeeById(int id);
	public List<Employee> getAllEmployeesByPagination(String maxPage,String ofSet);
	public int getEmployeeCount();
}
