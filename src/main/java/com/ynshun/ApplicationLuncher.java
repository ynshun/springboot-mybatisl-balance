package com.ynshun;

import org.springframework.boot.SpringApplication;

import com.ynshun.common.config.RootConfiguration;

public class ApplicationLuncher {

	public static void main(String[] args) {
		SpringApplication.run(RootConfiguration.class, args);
	}
}
