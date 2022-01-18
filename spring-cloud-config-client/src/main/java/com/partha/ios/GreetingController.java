package com.partha.ios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class GreetingController {
	
	@Autowired
	private DbSetting dbSetting;
	
	@Value("${my.greeting}")
	private String greetingMessage;
	
	@GetMapping("/getDetails")
	public String getDetails() {
		return greetingMessage +" :: "+dbSetting.getUrl();
		
	}
	
	
	
	

}
