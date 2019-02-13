package com.springboot.examples.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.examples.model.ChangeAction;

public interface ChangeActionRepository extends JpaRepository<ChangeAction, Long>{

}
