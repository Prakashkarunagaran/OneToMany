package com.springboot.examples.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.springboot.examples.model.ResourceMaster;

public interface ResourceMasterRepository extends CrudRepository<ResourceMaster, Long>
{
	@Query(value="SELECT rm.firstName FROM ResourceMaster rm WHERE rm.firstName LIKE :firstName%")
	List<String> findByResName(@Param("firstName") String firstName);

	@Query(value="SELECT rm FROM ResourceMaster rm WHERE rm.firstName LIKE :firstName%")
	List<ResourceMaster> findByFirstnameStartingWith(@Param("firstName") String firstName);

	@Query("SELECT rm FROM ResourceMaster rm WHERE rm.firstName LIKE ?1%")
	List<ResourceMaster> findResourceByFirstname(String firstName);

	@Query("SELECT rm.sfMailAddress FROM ResourceMaster rm WHERE rm.roleCode =?1")
	List<String> getSfEmailAddresses(int assignedRoleCode);
	
	@Query("SELECT rm.htcMailAddress FROM ResourceMaster rm WHERE rm.roleCode =?1")
	List<String> getHtcEmailAddresses(int assignedRoleCode);
	
	@Query("SELECT rm FROM ResourceMaster rm WHERE rm.employeeNo =:employeeNo")
	ResourceMaster findRoleBasedOnEmpNo(@Param("employeeNo") String employeeNo);
}
