package com.laptrinhjavaweb.dao;

import java.util.List;

import com.laptrinhjavaweb.mapper.RowMapper;

public interface GenericDAO<T> {
	//select data: lay du lieu len
	<T> List<T> query(String sql, RowMapper<T> rowMapper, Object... parameters);
	//update and delete return void
	void update(String sql, Object... parameters);
	void delete(String sql, Object... parameters);
	//insert have return a id to load page
	Long insert(String sql, Object... parameters);
	int count(String sql, Object... parameters);
}
