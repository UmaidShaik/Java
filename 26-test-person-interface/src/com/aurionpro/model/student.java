package com.aurionpro.model;

import java.time.LocalDate;


public class student extends person {
	
	public  String branch;

		
	public student(int id, String address, LocalDate date, String branch) {
		super(id, address, date);
		this.branch = branch;
	}

	@Override
	public String toString() {
		return super.toString()+"student [branch=" + branch + "]";
	}
	

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
    
	
	
	}

	
	

