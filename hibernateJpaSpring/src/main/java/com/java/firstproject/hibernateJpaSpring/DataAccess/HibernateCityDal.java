package com.java.firstproject.hibernateJpaSpring.DataAccess;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.java.firstproject.hibernateJpaSpring.Entities.City;

@Repository		// showing repository class
public class HibernateCityDal implements ICityDal{						// this class for data's managing on hibernate
																		// and ICityDal becoming service for here,
																		// should implements
	private EntityManager entityManager;
	
	@Autowired															// Annotation coming from Spring FrameWork, its for showing entityManager.
	public HibernateCityDal(EntityManager entityManager) {				// EntityManager class for using sessions
		this.entityManager = entityManager;
	}
	
	//AOP - Aspect Oriented Programming (@Transactional, must import from org.springframework.transaction...)
	@Override	
	@Transactional																				// Transactional for session
	public List<City> getAll() {																
		Session session = entityManager.unwrap(Session.class);									// Creating a variable from Session type, and defining it for EntityManager
		List<City> cities = session.createQuery("from City",City.class).getResultList(); // sending get request with this variable, and returning data's to a list    	
		return cities;	// returning list																
		
	}

	@Override
	public void add(City city) {
		Session session = entityManager.unwrap(Session.class); 
		session.saveOrUpdate(city);
	}

	@Override
	public void update(City city) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(city);
		
	}

	@Override
	public void delete(City city) {
		Session session = entityManager.unwrap(Session.class);
		City cityToDelete = session.get(City.class, city.getId());
		session.delete(cityToDelete);
		
	}

	@Override
	public City getById(int id) {
		Session session = entityManager.unwrap(Session.class);
		City city = session.get(City.class, id);
		return city;
		
		
		
	}

}


										// 	netstat -ano | findstr :<yourPortNumber>
										//	taskkill /PID <typeyourPIDhere> /F
