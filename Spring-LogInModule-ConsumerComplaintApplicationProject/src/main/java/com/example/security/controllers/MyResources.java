package com.example.security.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value="This is the log in controller")
@RestController
public class MyResources {
	
	Logger logger = (Logger) LoggerFactory.getLogger(MyResources.class);
	@ApiOperation(value="This handler methods is for all advisors")
	@GetMapping("/advisors")
	public String advisor()
	{
		logger.info("called advisor() method");
		return "Hello Advisor!!!";
	}
	
	@ApiOperation(value="This handler methods is for all consumers")
	@GetMapping("/consumers")
	public String consumer()
	{
		logger.info("called consumer() method");
		return "Hello Consumer!!!";
	}
	
	@ApiOperation(value="This handler methods is for admin")
	@GetMapping("/admin")
	public String admin()
	{
		logger.info("called admin() method");
		return "Hello Admin!!!";
	}
}