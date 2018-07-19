package com.ynshun.common.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;



@EnableAutoConfiguration
@SpringBootApplication
@EnableTransactionManagement(order = 10) // 开启事务，并设置order值，默认是Integer的最大值
@ComponentScan(value = "com.ynshun", excludeFilters = { @Filter(Controller.class),
		@Filter(type = FilterType.ASSIGNABLE_TYPE, value = { RootConfiguration.class }) })
public class RootConfiguration extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(this.getClass());
	}

}