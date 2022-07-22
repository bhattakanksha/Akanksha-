package com.info.ui.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.info.ui.DTO.DepartmentDTO;
@Repository

public interface DepartmentRepository  extends CrudRepository<DepartmentDTO , Integer> {

}
