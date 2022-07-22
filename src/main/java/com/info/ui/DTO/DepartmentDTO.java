package com.info.ui.DTO;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="dept_tbl")

public class DepartmentDTO {

   @Id
   @Column(name="deptId")
   int deptNo;
   @Column(name= "deptName" , length=20)
   String deptName;
public DepartmentDTO(int deptNo, String deptName) {
	super();
	this.deptNo = deptNo;
	this.deptName = deptName;
}
public DepartmentDTO() {
	super();
	// TODO Auto-generated constructor stub
}
public int getDeptNo() {
	return deptNo;
}
public void setDeptNo(int deptNo) {
	this.deptNo = deptNo;
}
public String getDeptName() {
	return deptName;
}
public void setDeptName(String deptName) {
	this.deptName = deptName;
}
@Override
public String toString() {
	return "DepartmentDTO [deptNo=" + deptNo + ", deptName=" + deptName + "]";
}
   
   
	
}
	
	