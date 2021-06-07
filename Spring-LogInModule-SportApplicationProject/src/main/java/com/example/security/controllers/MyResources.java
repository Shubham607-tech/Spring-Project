
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
	@ApiOperation(value="This handler methods is for all coaches")
	@GetMapping("/coaches")
	public String coach()
	{
		logger.info("called coach() method");
		return "Hello Coach!!!";
	}
	@ApiOperation(value="This handler methods is for all athletes")
	@GetMapping("/athletes")
	public String athlete()
	{
		logger.info("called athlete() method");
		return "Hello Athlete!!!";
	}
	@ApiOperation(value="This handler methods is for all guestusers")
	@GetMapping("/guestusers")
	public String guestuser()
	{
		logger.info("called guestuser() method");
		return "Hello guestuser!!!";
	}
	@ApiOperation(value="This handler methods is for admin")
	@GetMapping("/admin")
	public String admin()
	{
		logger.info("called admin() method");
		return "Hello Admin!!!";
	}
}