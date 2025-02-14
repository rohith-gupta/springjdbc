package com.springjdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springjdbc.entities.Particles;

public class RowImpl implements RowMapper<Particles>{

	@Override
	public Particles mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Particles p = new Particles();
		
		p.setPartId(rs.getInt(1));
		p.setPartName(rs.getString(2));
		p.setPartDescription(rs.getString(3));
		p.setPrice(rs.getFloat(4));
		p.setDateStart(rs.getString(5));
		p.setVendorId(rs.getInt(6));
		
		
		return p;
	}

}
