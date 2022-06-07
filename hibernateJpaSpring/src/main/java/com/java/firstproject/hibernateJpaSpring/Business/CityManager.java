package com.java.firstproject.hibernateJpaSpring.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.java.firstproject.hibernateJpaSpring.DataAccess.ICityDal;
import com.java.firstproject.hibernateJpaSpring.Entities.City;

@Service  		// Annotation for indicate to here there is service class
public class CityManager implements ICityService{
	
	
	private ICityDal cityDal;			

	@Autowired		// solving necessary package
	public CityManager(ICityDal cityDal) {		// constructor for using CityDal
		this.cityDal = cityDal;
	}

	@Override
	public List<City> getAll() {
		
		return this.cityDal.getAll();		
	}

	
	@Override
	@Transactional
	public void add(City city) {
		this.cityDal.add(city);
		
	}

	@Override
	@Transactional
	public void update(City city) {
		this.cityDal.update(city);
		
	}

	@Override
	@Transactional
	public void delete(City city) {
		this.cityDal.delete(city);
		
	}

	@Override
	@Transactional
	public City getById(int id) {
		
		return this.cityDal.getById(id);
	}
	
	
	

}
