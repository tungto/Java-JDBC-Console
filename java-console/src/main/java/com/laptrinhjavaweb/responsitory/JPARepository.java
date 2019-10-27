package com.laptrinhjavaweb.responsitory;

import java.util.List;

public interface JPARepository<T> {
	List<T> findAll(int offset, int limit, Object...objects);
}
