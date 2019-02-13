package com.springboot.examples.repository;



import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.springboot.examples.model.ChangeRecord;
import com.springboot.examples.to.ChangeRecordTo;



public interface ChangeRepository extends CrudRepository<ChangeRecord, Integer> {
	
	List<ChangeRecord> findByChangeId( int chngId);
}