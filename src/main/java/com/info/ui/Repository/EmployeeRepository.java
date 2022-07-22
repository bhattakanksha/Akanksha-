package com.info.ui.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.info.ui.DTO.EmployeeDTO;
@Repository

public interface EmployeeRepository extends CrudRepository<EmployeeDTO , Integer> {

}
