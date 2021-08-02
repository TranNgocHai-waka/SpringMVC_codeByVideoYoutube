 package com.laptrinhjavaweb.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

//import org.apache.commons.lang.StringUtils;

import com.laptrinhjavaweb.model.NewModel;
import com.laptrinhjavaweb.mapper.NewMapper;
import com.laptrinhjavaweb.paging.Pageble;

import com.laptrinhjavaweb.dao.INewDAO;

@Repository
public class NewDAO extends AbstractDAO<NewModel> implements INewDAO {

	
	public List<NewModel> findAll() {
		StringBuilder sql = new StringBuilder("SELECT * FROM news");
			return query(sql.toString(), new NewMapper());
	}
}
