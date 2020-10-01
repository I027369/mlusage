package com.sap.csaiml.usage.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.sap.csaiml.usage.models.Employee;
import com.sap.csaiml.usage.models.User;

public interface UserRepository extends CrudRepository<User, Long>{
	
	Optional<User> findByUserName(String userName);

}
