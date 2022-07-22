package com.infosys.DTO;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="emp_tbl")
	

public class EmployeeDTO {
	
	@Id
	@Column(name="empId")
	int empId;
	@Column(name="empName" , length=20)
	String empName;
	@Column(name="empSal")
    int empSal;
	
	@OneToOne(cascade = CascadeType.ALL)
	OfficeDTO offId;

	public EmployeeDTO() {
		super();
	}

	public EmployeeDTO(int empId, String empName, int empSal, OfficeDTO officeId) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.offId = offId;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpSal() {
		return empSal;
	}

	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}

	public OfficeDTO getOffId() {
		return offId;
	}

	public void setOffId(OfficeDTO offId) {
		this.offId = offId;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", officeId=" + offId
				+ "]";
	}
    
	
	
	
}