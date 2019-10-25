package com.laptrinhjavaweb.converter;

import org.modelmapper.ModelMapper;

import com.laptrinhjavaweb.dto.BuildingDTO;
import com.laptrinhjavaweb.entity.BuildingEntity;

public class BuildingConverter {
	public BuildingDTO convertToBTO(BuildingEntity entity) {
		ModelMapper modelMapper = new ModelMapper();
		
		return modelMapper.map(entity, BuildingDTO.class);
	}
}
