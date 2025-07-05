package com.app.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	@Bean
	public SecurityFilterChain securityFilter(HttpSecurity http) throws Exception {
		http.csrf(csrf -> csrf.disable())
		    .authorizeHttpRequests(request -> request.requestMatchers("/producer","/contact","/about").permitAll()
			.anyRequest().authenticated())
			.httpBasic();
		return http.build();
		
	}
	@Bean
	public UserDetailsManager inMemoryUsers() {
		
		UserDetails surajUser=User.withDefaultPasswordEncoder()
				                  .username("ashwin")
				                  .password("ashwin123")
				                  .authorities("ADMIN")
				                  .build();
		
		UserDetails samUser=User.withDefaultPasswordEncoder()
				                .username("sam")
				                .password("sam123")
				                .authorities("USER")
				                .build();
		
		return new InMemoryUserDetailsManager(surajUser,samUser);
		
	}

}
