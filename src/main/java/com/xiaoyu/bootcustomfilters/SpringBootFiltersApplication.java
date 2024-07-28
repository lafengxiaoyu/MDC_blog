package com.xiaoyu.bootcustomfilters;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

@Profile("filter")
@SpringBootApplication
public class SpringBootFiltersApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFiltersApplication.class, args);
	}
}
