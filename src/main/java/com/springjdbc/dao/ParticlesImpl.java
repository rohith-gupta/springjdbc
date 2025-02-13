package com.springjdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.springjdbc.entities.Particles;

public class ParticlesImpl implements ParticlesDao{

	JdbcTemplate template;
	
	
	
	public JdbcTemplate getTemplate() {
		return template;
	}



	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}



	@Override
	public int insert(Particles particle) {
		
		String query = "INSERT INTO Particles(PartID, PartName, PartDescription, Price, DateStart, VendorID) VALUES(?, ?, ?, ?, ?, ?)";
		
		int result = template.update(query, particle.getPartId(), particle.getPartName(), particle.getPartDescription(), particle.getPrice(), particle.getDateStart(), particle.getVendorId());
		
		return result;
	}

}
