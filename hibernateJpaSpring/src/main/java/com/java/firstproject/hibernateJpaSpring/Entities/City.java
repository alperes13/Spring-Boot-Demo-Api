package com.java.firstproject.hibernateJpaSpring.Entities;

import javax.persistence.*;

@Entity						//This annotation defining to there is this class object of database
@Table(name = "City")		//We must indicate here there is table from database, and defining with we working with which table 
public class City {         // created field/Attributes class here, for database tables
	
	
	
	@Id															// Calling to there is ID field
	@Column(name = "ID")										// Showing which column there is.
	@GeneratedValue(strategy=GenerationType.IDENTITY)           // defined attributes
	private int id;
	
	@Column(name = "name")										// Showing which column there is.
	private String name;
	
	@Column(name = "countrycode") 								// Showing which column there is.
	private String countryCode;
	
	@Column(name = "district")									// Showing which column there is.
	private String district;
	
	@Column(name = "population")								// Showing which column there is.
	private int population;
	
	
	
	public City(int id, String name, String countryCode, String district, int population) {    
		super();
		this.id = id;
		this.name = name;
		this.countryCode = countryCode;
		this.district = district;
		this.population = population;
	}
	
	
	public City() {}		// This is for HIBERNATE, default constructor
	
	
	
	public int getId() {  											
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}

	
	
}
