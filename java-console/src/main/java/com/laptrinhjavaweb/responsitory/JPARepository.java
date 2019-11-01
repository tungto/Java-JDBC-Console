package com.laptrinhjavaweb.responsitory;

import java.util.List;
import java.util.Map;

import com.laptrinhjavaweb.paging.Pageable;

public interface JPARepository<T> {
	List<T> findAll(Map<String, Object> properties,  Pageable pageable, Object...objects);
}
