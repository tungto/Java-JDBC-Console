package com.laptrinhjavaweb.responsitory;

import java.util.List;
import java.util.Map;

import com.laptrinhjavaweb.entity.BuildingEntity;
import com.laptrinhjavaweb.paging.Pageable;

public interface IBuildingRepository extends JPARepository<BuildingEntity>{
//	List<BuildingEntity> findAll(Map<String, Object> params, Pageable pageable);
}
