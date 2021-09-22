package br.com.madrugas.agenda.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import br.com.madrugas.agenda.service.TokenService;


@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecutiryConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private AuthService userDetailService;
	@Autowired 
	private TokenService tokenService;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailService).passwordEncoder(encoder());
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.headers().frameOptions().disable().and()
		.authorizeRequests().
		//antMatchers(HttpMethod.GET,"/clientes/**","/usuarios/*").
		//permitAll().
		antMatchers(HttpMethod.GET,"/agenda/*").
		permitAll().
		antMatchers("/h2-console/**")
		.permitAll().
		antMatchers(HttpMethod.POST,"/auth/**").
		permitAll().
		anyRequest().
		authenticated().and().csrf().disable()
		.sessionManagement()
		.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
		.and()
		.addFilterBefore(new JwtToken(tokenService,userDetailService),
		UsernamePasswordAuthenticationFilter.class);
	}

	@Bean
	@Override
	protected AuthenticationManager authenticationManager() throws Exception {
		return super.authenticationManager();
	}
	
	@Bean
	public BCryptPasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}
	
}
