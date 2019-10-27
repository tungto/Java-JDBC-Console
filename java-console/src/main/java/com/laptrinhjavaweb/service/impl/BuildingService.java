package com.laptrinhjavaweb.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.laptrinhjavaweb.converter.BuildingConverter;
import com.laptrinhjavaweb.dto.BuildingDTO;
import com.laptrinhjavaweb.responsitory.IBuildingRepository;
import com.laptrinhjavaweb.responsitory.impl.BuildingRepository;
import com.laptrinhjavaweb.service.IBuildingService;

public class BuildingService implements IBuildingService {

	private IBuildingRepository buildingRepository;
	private BuildingConverter buildingConverter;

	public BuildingService() {
		buildingRepository = new BuildingRepository();
		buildingConverter = new BuildingConverter();
	}

	@Override
	public List<BuildingDTO> findAll(String name, String district, int buildingArea, int numberOfBasement, int offset, int limit ) {
		/*
		 * List<BuildingDTO> results = new ArrayList<>(); List<BuildingEntity>
		 * buildingEntities = buildingRepository.findAll(); for (BuildingEntity item :
		 * buildingEntities) {
		 * 
		 * // BuildingDTO buildingDTO = new BuildingDTO(); //
		 * buildingDTO.setName(item.getName()); //
		 * buildingDTO.setStructure(item.getStructure()); results.add(buildingDTO);
		 * 
		 * BuildingDTO buildingDTO1 = buildingConverter.convertToBTO(item);
		 * results.add(buildingDTO1); } return results;
		 */

		// java 8
		Map<String, Object> maps = new HashMap<String,Object>();
		
		
		return buildingRepository.findAll(maps, offset, limit).stream().map(item -> buildingConverter.convertToBTO(item))
				.collect(Collectors.toList());
	}

}
