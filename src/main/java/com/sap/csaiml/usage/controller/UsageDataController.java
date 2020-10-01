package com.sap.csaiml.usage.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sap.csaiml.usage.models.UsageData;
import com.sap.csaiml.usage.services.UsageDataService;

@RestController
public class UsageDataController {
	
	Logger log = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private UsageDataService usageDataService;
	
	@RequestMapping("/usagedata/count")
	public long count() {
		log.info("Search total number of UsageData");
		return usageDataService.getCount();
	}

	
	@RequestMapping(method=RequestMethod.POST, value = "/usagedata")
	public List<UsageData> addEmployee(@RequestBody List<UsageData> usageDataWrapper) {
		
		log.info("Create UsageData - "+usageDataWrapper.toString());
		usageDataWrapper.forEach(usageData -> usageDataService.insertUsageData(usageData));
		return usageDataWrapper;
	}
	
	
	@RequestMapping(method=RequestMethod.POST, value="/test/secure/api/callPost")
 	public void onProvision( HttpServletResponse response, @RequestBody(required = false) Map<String, Object> input) throws ParseException, IOException {	
		System.out.println("/test/secure/api/callPost");
		String inputBody = "nobody";
		if (input!=null) {
			inputBody = "body included";
			for (String key : input.keySet())  
	        { 
	            Object value = input.get(key); 
	            System.out.println("Key = " + key + ", Value = " + value); 
	        } 
		}
		
		JSONParser parser = new JSONParser();
		JSONObject payload = (JSONObject) parser.parse("{}");
		payload.put("Msg", "unsecure/api/callPost. body "+inputBody);
		response.setContentType("application/json");
		response.getWriter().print(payload.toJSONString());
	}
	
}
