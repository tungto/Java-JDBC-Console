package com.laptrinhjavaweb.controller;

import java.util.List;

import com.laptrinhjavaweb.dto.BuildingDTO;
import com.laptrinhjavaweb.service.IBuildingService;
import com.laptrinhjavaweb.service.impl.BuildingService;

public class BuildingController {
	
	 public static void main(String[] args) {
		 int page = 1;
		 int limit = 2;
		 int offset = (page - 1) * limit;
		 String name = "Tower";
		 String district =  "QUAN_2";
		 int buildingArea = 650;
		 int numberOfBasement=2;
		 
		 IBuildingService buildingService = new BuildingService();
		 List<BuildingDTO> buildings = buildingService.findAll(name, district,buildingArea,numberOfBasement,  offset, limit);
		 for(BuildingDTO item: buildings) {
			 System.out.println("ID: " + item.getId() + " Name " + item.getName() + " Address " + item.getStreet() + " " + item.getBuildingArea());
		 }
	 }
	
}
