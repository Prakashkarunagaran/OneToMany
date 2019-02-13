package com.springboot.examples.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.springboot.examples.model.ChangeStatus;

public interface ChangeStatusRepository extends CrudRepository<ChangeStatus, Long>{
	@Override
	@Query
	public List<ChangeStatus> findAll();

}
