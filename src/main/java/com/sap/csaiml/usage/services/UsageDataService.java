package com.sap.csaiml.usage.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sap.csaiml.usage.models.UsageData;
import com.sap.csaiml.usage.repository.UsageDataRepository;

@Service
public class UsageDataService {

	@Autowired
	private UsageDataRepository usageDataRepository;
	
	
	public long getCount() {
		long count = usageDataRepository.count();
		return count;
	}
	
	
	public boolean insertUsageData(UsageData usageData) {
		
		 try {
			 	usageDataRepository.save(usageData);
			 	return true;
		 } 
		 catch (Exception e) {
			 return false;
		}
	}
	
}
