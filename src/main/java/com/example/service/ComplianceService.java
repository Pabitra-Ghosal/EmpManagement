package com.example.service;

import java.util.List;

import com.example.entity.Compliance;
import com.example.entity.StatusReport;

public interface ComplianceService {
	
	public void createRL(Compliance co);
	public List<Compliance> getAllRL();
	public List<Compliance> getAllRL(int userId);
	public void createStatusReport(StatusReport report);
	public List<StatusReport> getAllStatusReport(int userId, int compId);
}
