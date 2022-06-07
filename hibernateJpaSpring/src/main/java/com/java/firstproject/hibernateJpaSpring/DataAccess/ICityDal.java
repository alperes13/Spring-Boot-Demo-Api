package com.java.firstproject.hibernateJpaSpring.DataAccess;
import java.util.*;

import com.java.firstproject.hibernateJpaSpring.Entities.*;


public interface ICityDal {         // this is interface for class of data access layer
									// in the future, if access class necessary to be change, this interface will help us. 
	List<City> getAll();
	void add(City city);
	void update(City city);
	void delete(City city);
	City getById(int id);

}
