package com.springjdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.springjdbc.entities.Particles;

public class ParticlesImpl implements ParticlesDao{

	JdbcTemplate template;
	
	
	
	public JdbcTemplate getTemplate() {
		return template;
	}



	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}



	public int insert(Particles particle) {
		
		String query = "INSERT INTO Particles(PartID, PartName, PartDescription, Price, DateStart, VendorID) VALUES(?, ?, ?, ?, ?, ?)";
		
		int result = template.update(query, particle.getPartId(), particle.getPartName(), particle.getPartDescription(), particle.getPrice(), particle.getDateStart(), particle.getVendorId());
		
		return result;
	}
	
	public int update(Particles particle) {
		
		String query = "Update Particles set PartName=?, PartDescription=? where PartID=?";
		
		int result = template.update(query, particle.getPartName(), particle.getPartDescription(), particle.getPartId());
		
		return result;
	}
	
	public int delete(Particles particle) {
		
		String query = "DELETE FROM Particles WHERE PartID =?";
		
		int result = template.update(query, particle.getPartId());
		
		return result;

	}

	public Particles getonerow(int partID) {
		
		String query = "Select * from Particles where PartID=?";
		RowMapper<Particles> rm = (RowMapper<Particles>) new RowImpl();
		Particles p = template.queryForObject(query, rm, partID);
		return p;
	}



	@Override
	public Particles getonerow(String partName) {
		String query = "Select * from Particles where PartName=?";
		RowMapper<Particles> rm = (RowMapper<Particles>) new RowImpl();
		Particles p = template.queryForObject(query, rm, partName);
		return p;
	}
	
	
	
	

}
