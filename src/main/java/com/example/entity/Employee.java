package com.example.entity;

import java.time.LocalDate;

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
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(length = 5)
	private int empId;
	
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY,targetEntity = User.class)
	@JoinColumn(name = "userId")
	private User user;
	
	@Column(length = 15)
	private String firstName;
	
	@Column(length = 15)
	private String lastName;
	
	@Column(length = 25)
	private String email;
	
	@Column(length = 10)
	private LocalDate dob;
	
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY,targetEntity = Department.class)
	@JoinColumn(name = "departmentId")
	private Department department;

}
