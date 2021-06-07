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
	@ApiOperation(value="This handler methods is for all managers")
	@GetMapping("/managers")
	public String manager()
	{
		logger.info("called manager() method");
		return "Hello Manager!!!";
	}
	
	@ApiOperation(value="This handler methods is for all securities")
	@GetMapping("/securities")
	public String security()
	{
		logger.info("called security() method");
		return "Hello Security!!!";
	}
	
	@ApiOperation(value="This handler methods is for all customers")
	@GetMapping("/customers")
	public String customer()
	{
		logger.info("called customer() method");
		return "Hello Customer!!!";
	}

	@ApiOperation(value="This handler methods is for admin")
	@GetMapping("/admin")
	public String admin()
	{
		logger.info("called admin() method");
		return "Hello Admin!!!";
	}
}