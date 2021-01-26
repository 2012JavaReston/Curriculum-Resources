package com.revature.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigRestTemplate {

	@Bean //This method is mean to return an entity, that will be managed by Spring. 
	public RestTemplate rest(RestTemplateBuilder builder) {
		/*
		 * This method will return the RestTemplate
		 * So Spring will now have the tools to create a RestTemplate, and inject the resttemplate 
		 */
		return builder.build();
	}
}
