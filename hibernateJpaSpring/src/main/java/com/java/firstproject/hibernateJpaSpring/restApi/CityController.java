package com.java.firstproject.hibernateJpaSpring.restApi;
import com.java.firstproject.hibernateJpaSpring.Entities.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.firstproject.hibernateJpaSpring.Business.ICityService;

// MVC Execute in here!


@RestController							// We must indicate here there is a @RestController 			
@RequestMapping("/api")					// This is standard
public class CityController {
	
	private ICityService cityService ;		// define to ICityService for using with API

	@Autowired		// Will find injection in packages
	public CityController(ICityService cityService) { 		// Constructor
		this.cityService = cityService;
	}
	
	@GetMapping("/cities")             // if we using GetMapping, its mean there is will be return. Example: Getting data from database.
	public List<City> get(){
		return cityService.getAll();	// bring method from cityService for API process
		
	}
	
	@PostMapping("/add")		// PostMapping for void operations. It is not returning anything, only sending.
	public void add(@RequestBody City city) {	// RequestBody annotation telling us "parameters in body". 
		cityService.add(city);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody City city) {
		cityService.update(city);
	}
	
	@PostMapping("/delete")
	public void delete(@RequestBody City city) {
		cityService.delete(city);
	}
	
	@GetMapping("/cities/{id}")			// If we want to use parameters in path, must to indicate it in {...}.
	public City getById(@PathVariable int id){	// PathVariable annotation will take it in path
		return cityService.getById(id);
	
	}
	

}
