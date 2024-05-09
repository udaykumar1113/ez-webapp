package com.example.ezbytes.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecurityConfig {
    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests((requests) ->
            requests.requestMatchers("/home").permitAll()
                    .requestMatchers("/holidays/**").permitAll()
                    .requestMatchers("/contact").permitAll()
                    .requestMatchers("/saveMsg").permitAll()
                    .requestMatchers("/courses").authenticated()
                    .requestMatchers("/about").permitAll()
                    .requestMatchers("/assets/**").permitAll()
                )
        .formLogin(Customizer.withDefaults())
        .httpBasic(Customizer.withDefaults());
        return (SecurityFilterChain)http.build();
    }
}
