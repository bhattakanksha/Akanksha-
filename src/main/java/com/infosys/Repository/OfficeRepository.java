package com.infosys.Repository;

import org.springframework.data.repository.CrudRepository;

import com.infosys.DTO.OfficeDTO;

public interface OfficeRepository extends CrudRepository <OfficeDTO ,  Integer> {

}
