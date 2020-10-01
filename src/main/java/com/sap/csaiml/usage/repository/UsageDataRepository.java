package com.sap.csaiml.usage.repository;

import org.springframework.data.repository.CrudRepository;

import com.sap.csaiml.usage.models.Employee;
import com.sap.csaiml.usage.models.UsageData;

public interface UsageDataRepository extends CrudRepository<UsageData, Long>{
	

}
