package com.info.ui.Service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.info.ui.DTO.DepartmentDTO;
import com.info.ui.DTO.EmployeeDTO;
import com.info.ui.Repository.DepartmentRepository;
import com.info.ui.Repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeDepartmentService implements IEmployeeDepartmentService{
	
	@Autowired
	EmployeeRepository empRepo;
	@Autowired
	DepartmentRepository deptRepo;
	@Override
	public boolean addRecord(DepartmentDTO d, EmployeeDTO e) {
		deptRepo.save(d);
	  empRepo.save(e);
		return true;
	}
	
	
	

}
