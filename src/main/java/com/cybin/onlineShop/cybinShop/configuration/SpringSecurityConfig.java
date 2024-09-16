package com.cybin.onlineShop.cybinShop.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig {

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                    //.antMatchers("/users/**", "/settings/**").hasAuthority("Admin")
                    .antMatchers("/h2-console").hasAuthority("Admin")
                .antMatchers("/", "/js/**", "/css/**", "/images/**").permitAll()
                .anyRequest().authenticated()
                    .and()
                .formLogin()
                    .loginPage("/login.html")
                    .permitAll()
                    .and()
                .logout()
                    .permitAll();
//                .usernameParameter("email")

//                .and()
//                .rememberMe().key("AbcdEfghIjklmNopQrsTuvXyz_0123456789")
//                .and()

//                .and()
//                .csrf()
//                .disable();

//        http.headers().frameOptions().sameOrigin();

        return http.build();
    }

    @Bean
    public WebSecurityCustomizer webSecurityCustomizer() {

        return (web) -> web.ignoring().antMatchers("/images/**", "/js/**", "/webjars/**");
    }
}
