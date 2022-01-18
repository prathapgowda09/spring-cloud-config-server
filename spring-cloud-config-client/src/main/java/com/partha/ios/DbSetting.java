package com.partha.ios;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DbSetting {
	
	@Value("${db.url}")
	private String url;
	

	@Value("${db.host}")
	private String host;
	
	@Value("${db.port}")
	private String port;
	
	public DbSetting() {
		// TODO Auto-generated constructor stub
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}
	
	
	
	
}
