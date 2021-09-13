package com.neosoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.bean.PropertiesDB;
import com.neosoft.configuration.Configuration;

@RestController
public class DBPRopertyController {
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/db_props")
	public PropertiesDB retriveProp() {
		return new PropertiesDB(configuration.getDriver(), configuration.getUrl(), configuration.getUsername(), configuration.getPassword());
	}

}
