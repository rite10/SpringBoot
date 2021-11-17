package com.nt.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.nt.beans")
public class AppConfig {
	public AppConfig() {
System.out.println("Appconfig::0-param constructor");
}
	@Bean(name="SysDate")
	public LocalDateTime createLDT () {
		System.out.println("AppConfig.createLTD()");
		return LocalDateTime.now();
	}
}
