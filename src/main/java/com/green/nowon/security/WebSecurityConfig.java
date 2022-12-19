package com.green.nowon.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;


@EnableWebSecurity
public class WebSecurityConfig {
	
	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http
			.authorizeRequests(authorize -> authorize
					.antMatchers("/css/**","/js/**","/images/**").permitAll()
					.antMatchers("/","/signup","/signup2","/customer/**","/admin/**").permitAll()
					.anyRequest().authenticated()
			)
			.formLogin(formLogin->formLogin
					.loginPage("/signin")
					.loginProcessingUrl("/signin")//form태그의 action
					.usernameParameter("email")//username ->email
					.passwordParameter("pass") //password -> pass
					.permitAll()
					)
				.csrf(csrf->csrf.disable())
			;
		return http.build();
	}
}

