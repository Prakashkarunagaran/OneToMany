package com.springboot.examples.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.examples.model.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {

}
