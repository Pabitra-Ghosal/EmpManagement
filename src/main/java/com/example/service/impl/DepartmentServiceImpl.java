package com.example.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entity.Department;
import com.example.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Override
	public void addDepartment(String dname) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Department> getAllDepartments() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Department> getAllDepartmentsByPagination(String maxPage, String ofset) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getAllDepartCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean deleteDepartment(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
