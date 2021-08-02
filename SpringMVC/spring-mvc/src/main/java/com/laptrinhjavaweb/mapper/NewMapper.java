package com.laptrinhjavaweb.mapper;

import java.sql.ResultSet;

import com.laptrinhjavaweb.model.NewModel;

public class NewMapper implements RowMapper<NewModel> {

	public NewModel mapRow(ResultSet resultSet) {
		try {
			NewModel news = new NewModel();
			news.setId(resultSet.getLong("id"));
			news.setTitle(resultSet.getString("title"));
			news.setContent(resultSet.getString("content"));
			news.setCategoryCode(resultSet.getString("categoryid"));
			news.setThumbnail(resultSet.getString("thumbnail"));
			news.setShortDescription(resultSet.getString("shortdescription"));
			news.setCreatedDate(resultSet.getTimestamp("createddate"));
			news.setCreatedBy(resultSet.getString("createdby"));
			//chi khi update ms co nen phai ktra, vi th insert k co du lieu
			if(resultSet.getTimestamp("modifieddate") != null) {
				news.setModifiedDate(resultSet.getTimestamp("modifieddate"));
			}
			if(resultSet.getTimestamp("modifiedby") != null) {
				news.setModifiedDate(resultSet.getTimestamp("modifiedby"));
			}
			return news;
			
		} catch (Exception e) {
			return null;
		}
		
	}
	
}
