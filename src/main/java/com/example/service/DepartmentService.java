package com.example.service;

import java.util.List;

import com.example.entity.Department;

public interface DepartmentService {
	
	public void addDepartment(String dname);
	public List<Department> getAllDepartments();
	public List<Department> getAllDepartmentsByPagination(String maxPage,String ofset);
	public int getAllDepartCount();
	public boolean deleteDepartment(int id);

}
