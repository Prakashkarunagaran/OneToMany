package com.springboot.examples.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.examples.model.ConfigItem;

@Repository
public interface ConfigItemRepository extends CrudRepository<ConfigItem, Long> {
}
