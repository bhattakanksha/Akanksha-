package com.info.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.info.ui.DTO.DepartmentDTO;
import com.info.ui.DTO.EmployeeDTO;
import com.info.ui.Service.EmployeeDepartmentService;

@SpringBootApplication
public class EmployeeProject1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeProject1Application.class, args);
	}
       @Autowired
       EmployeeDepartmentService service;
       
       public void addRecord()
       {
    	   DepartmentDTO d = new DepartmentDTO(102 , "software engineer");
    	   EmployeeDTO e = new EmployeeDTO(2, "Prashik kamble", 500000, d);
           service.addRecord(d, e);
       }
       
       
       
       
	@Override
	public void run(String... args) throws Exception {
		addRecord();
		
		
	}

}
