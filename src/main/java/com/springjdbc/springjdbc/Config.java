package com.springjdbc.springjdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.springjdbc.dao.ParticlesImpl;

@Configuration
public class Config {
	
	
	@Bean("datasource")
	public DataSource getDataSource() {
		
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		
		datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		datasource.setUrl("jdbc:mysql://localhost:3306/dbstudent_");
		datasource.setUsername("root");
		datasource.setPassword("Root@001");
		
		return datasource;
	}
	
	
	@Bean("jdbcTemplate")
	public JdbcTemplate getTemplate() {
		
		JdbcTemplate temp = new JdbcTemplate();
		
		temp.setDataSource(getDataSource());
		
		return temp;
	}
	
	@Bean("particlesImpl")
	public ParticlesImpl getparticle() {
		
		ParticlesImpl particles = new ParticlesImpl();
		
		particles.setTemplate(getTemplate());
		
		return particles;
	}
	
	

}
