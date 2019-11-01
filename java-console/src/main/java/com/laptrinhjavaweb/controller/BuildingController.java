package com.laptrinhjavaweb.controller;

import java.util.List;

import com.laptrinhjavaweb.builder.BuildingSearchBuilder;
import com.laptrinhjavaweb.dto.BuildingDTO;
import com.laptrinhjavaweb.paging.PageRequest;
import com.laptrinhjavaweb.paging.Pageable;
import com.laptrinhjavaweb.service.IBuildingService;
import com.laptrinhjavaweb.service.impl.BuildingService;

public class BuildingController {
	
	 public static void main(String[] args) {
		 int page = 1;
		 int limit = 2;
		 String name = "Tower";
		 String district =  "QUAN_2";
		 int buildingArea = 650;
		 int numberOfBasement=2;
		 
		 IBuildingService buildingService = new BuildingService();
		 BuildingSearchBuilder buildingSearchBuilder = new BuildingSearchBuilder.Builder()
				 																.setName(name).setDistrict(district)
				 																.setBuildingArea(buildingArea).setNumberOfBasement(numberOfBasement).build();
		 Pageable pageable = new PageRequest(page, limit);
		 List<BuildingDTO> buildings = buildingService.findAll(buildingSearchBuilder, pageable);
		 for(BuildingDTO item: buildings) {
			 System.out.println("ID: " + item.getId() + " Name " + item.getName() + " Address " + item.getStreet() + " " + item.getBuildingArea());
		 }
	 }
	
}
