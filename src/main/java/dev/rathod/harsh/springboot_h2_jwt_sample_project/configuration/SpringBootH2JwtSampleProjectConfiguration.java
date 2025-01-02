package dev.rathod.harsh.springboot_h2_jwt_sample_project.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SpringBootH2JwtSampleProjectConfiguration {

	@Bean
	public SecurityFilterChain getSecurityFilterChain(HttpSecurity http)
		throws Exception {
		http
			.authorizeHttpRequests(
				authorize ->
					authorize
						.requestMatchers(AntPathRequestMatcher.antMatcher("/log{in,out}"))
						.permitAll()
						.requestMatchers(AntPathRequestMatcher.antMatcher("/h2-console/**"))
						.permitAll()
						.anyRequest()
						.authenticated()
			)
			.headers(
				header -> header.frameOptions(Customizer.withDefaults()).disable()
			)
			.csrf(
				csrf ->
					csrf.ignoringRequestMatchers(
						AntPathRequestMatcher.antMatcher("/h2-console/**")
					)
			)
			.formLogin(Customizer.withDefaults()) // To use default login form
			.rememberMe(Customizer.withDefaults());
		return http.build();
	}
}
