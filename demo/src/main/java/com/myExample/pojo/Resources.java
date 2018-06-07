package com.myExample.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 
 * @author song.qi
 * @version 2018年5月24日
 * @see com.myexample.opensource不能有大写字母
 */
@Configuration
@ConfigurationProperties(prefix = "com.myexample.opensource")
@PropertySource(value = "classpath:resources.properties")
public class Resources {
	private String name;
	private String website;
	private String language;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

}
