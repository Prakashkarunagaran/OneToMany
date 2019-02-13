package com.springboot.examples.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.examples.model.ChangeType;

public interface ChangeTypeRepository extends CrudRepository<ChangeType, Long> {

}
