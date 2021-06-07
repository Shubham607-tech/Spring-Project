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
	
	@ApiOperation(value="This handler methods is for all students")
	@GetMapping("/students")
	public String student()
	{
		logger.info("called student() method");
		return "Hello student!!!";
	}
	
	@ApiOperation(value="This handler methods is for all smes")
	@GetMapping("/smes")
	public String sme()
	{
		logger.info("called sme() method");
		return "Hello SME!!!";
	}
	
    @ApiOperation(value="This handler methods is for Admin")
	@GetMapping("/admin")
	public String admin()
	{
    	logger.info("called admin() method");
		return "Hello Admin!!!";
	}
}
