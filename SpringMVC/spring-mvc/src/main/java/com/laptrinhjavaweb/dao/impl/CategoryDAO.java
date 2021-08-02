package com.laptrinhjavaweb.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale.Category;

import com.laptrinhjavaweb.model.CategoryModel;
import com.laptrinhjavaweb.mapper.CategoryMapper;
import com.laptrinhjavaweb.dao.ICategoryDAO;

public class CategoryDAO extends AbstractDAO<CategoryModel> implements ICategoryDAO {

	public List<CategoryModel> findAll() {
		String sql = "select * from category";
		return query(sql, new CategoryMapper());
	}

	@Override
	public CategoryModel findOne(long id) {
		String sql = "SELECT * FROM category WHERE id = ?";
		List<CategoryModel> category = query(sql, new CategoryMapper(), id);
		if(category == null) {
			return null;
		}
		return category.isEmpty() ? null : category.get(0);
	}

	@Override
	public CategoryModel findOneByCode(String code) {
		String sql = "SELECT * FROM category WHERE code = ?";
		List<CategoryModel> category = query(sql, new CategoryMapper(), code);
		if(category == null)  {
			return null;
		}
		return category.isEmpty() ? null : category.get(0);
	}

	
	
//	public List<CategoryModel> findAll() {
//		List<CategoryModel> results = new ArrayList<CategoryModel>();
//		String sql = "select * form category";
//		Connection connection = getConnection();
//		PreparedStatement statement = null;
//		ResultSet resultSet = null;
//		if(connection != null) {
//			try {
//				statement = connection.prepareStatement(sql);
//				resultSet = statement.executeQuery();
//				while(resultSet.next()) {
//					CategoryModel category = new CategoryModel();
//					category.setId(resultSet.getLong("id"));
//					category.setCode(resultSet.getString("code"));
//					category.setName(resultSet.getString("name"));
//					results.add(category);
//				}
//				return results;
//			} catch (Exception e) {
//				return null;
//			} finally {
//				try {
//					if(connection != null) {
//						connection.close();
//					}
//					if(statement != null) {
//						statement.close();
//					}
//					if(resultSet != null) {
//						resultSet.close();
//					}
//				} catch (Exception e2) {
//					return null;
//				}
//			}
//		}
//		return null;
//		
//		
//	}

	
	



	
}
