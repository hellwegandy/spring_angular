package com.webcore

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer

@SpringBootApplication
class WebcoreApplication extends SpringBootServletInitializer {

	static void main(String[] args) {
		SpringApplication.run(WebcoreApplication, args)
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
		application.sources(WebcoreApplication.class)
	}

}
