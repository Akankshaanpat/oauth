package com.auth.config;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import lombok.extern.slf4j.Slf4j;



@Configuration
@Slf4j
public class SpringSecurity {

	@Bean
	SecurityFilterChain filterchain(HttpSecurity http) throws Exception {

		http.cors(co -> co.disable()).csrf(cs -> cs.disable())
				.authorizeHttpRequests(h -> h.anyRequest().authenticated()).oauth2Login(Customizer.withDefaults());
		log.info("here im using logger");
		return http.build();

	}

	
}
