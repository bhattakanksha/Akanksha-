package com.infosys.Repository;

import org.springframework.data.repository.CrudRepository;

import com.infosys.DTO.EmployeeDTO;

public interface EmployeeRepository extends CrudRepository<EmployeeDTO , Integer> {

}
