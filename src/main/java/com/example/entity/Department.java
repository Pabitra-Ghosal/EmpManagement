package com.example.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(length = 5)
	private int departId;
	@Column(length = 15)
	private String departName;
	
	@OneToOne(targetEntity = Employee.class)
	@JoinColumn(name = "empId")
	private Employee emp;
	
	@OneToOne(targetEntity = StatusReport.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "statusId")
	private StatusReport report;
	
	@OneToOne(targetEntity = Employee.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "complianceId")
	private Compliance compliance;

}
