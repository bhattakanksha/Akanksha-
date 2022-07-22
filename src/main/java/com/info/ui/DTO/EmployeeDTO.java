package com.info.ui.DTO;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="emp_tbl")

public class EmployeeDTO {
	@Id
	int empNo;
	@Column(name= "ename" , length=20)
	String empName;
	@Column(name="esal")
	int empSal;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="did")
	DepartmentDTO dept;
	public EmployeeDTO(int empNo, String empName, int empSal, DepartmentDTO dept) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.empSal = empSal;
		this.dept = dept;
	}
	public EmployeeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
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
	public DepartmentDTO getDept() {
		return dept;
	}
	public void setDept(DepartmentDTO dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "EmplyoeeDTO [empNo=" + empNo + ", empName=" + empName + ", empSal=" + empSal + ", dept=" + dept + "]";
	}
	
      
}






