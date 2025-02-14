package com.springjdbc.dao;

import java.util.List;

import com.springjdbc.entities.Particles;

public interface ParticlesDao {
	
	public int insert(Particles particle);
	
	public int update(Particles particle);
	
	public int delete(Particles particle);
	
	public Particles getonerow(int partID);
	
	public Particles getonerow(String partName);
	
	public List<Particles> getAllrows();

}
