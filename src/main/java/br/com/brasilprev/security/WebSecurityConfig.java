package br.com.brasilprev.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception {
		
		httpSecurity.authorizeRequests().anyRequest().permitAll().and()
				//.addFilterBefore(new TokenFilter(this.usuarioTokenService), BasicAuthenticationFilter.class)
				.csrf().disable();
		/*
		httpSecurity
		.csrf().disable()
		.cors().and()
		.authorizeRequests().antMatchers(HttpMethod.OPTIONS, "/**").permitAll().anyRequest().permitAll().and()
			.addFilterBefore(new TokenFilter(this.usuarioTokenService), BasicAuthenticationFilter.class);
*/
		
	}

	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/v2/api-docs", "/configuration/**", "/swagger-resources/**", "/swagger-ui.html",
				"/webjars/**", "/api-docs/**");
	}

}
