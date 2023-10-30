package com.priyalearning.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.priyalearning.model.Alien;
import java.util.List;


public  interface AlienRepo extends JpaRepository<Alien, Integer>{

	//Fetching data with Alien's property and using Custom query
	  List<Alien> findByTech(String tech); //SpringJPA Repository is giving the
	  //feature to custom search with the property of the Alien 
	  List<Alien> findByAidGreaterThan(int aid);
	  
	  @Query("from Alien where tech=?1 order by aid") List<Alien>
	  findbyTechSorted(String tech);
	 
}
