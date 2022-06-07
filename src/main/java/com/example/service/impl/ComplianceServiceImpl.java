package com.example.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entity.Compliance;
import com.example.entity.StatusReport;
import com.example.service.ComplianceService;

@Service
public class ComplianceServiceImpl implements ComplianceService{

	@Override
	public void createRL(Compliance co) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Compliance> getAllRL() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Compliance> getAllRL(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createStatusReport(StatusReport report) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<StatusReport> getAllStatusReport(int userId, int compId) {
		// TODO Auto-generated method stub
		return null;
	}

}
