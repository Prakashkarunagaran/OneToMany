package com.springboot.examples.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.examples.model.Location;

@Repository
public interface LocationRepository extends CrudRepository<Location, Long>{

}
