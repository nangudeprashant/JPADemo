package com.jpademo.JPADemo;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Employee {
	@Id
	private int empID;
	private String eName;

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", eName=" + eName + "]";
	}

}
