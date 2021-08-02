package com.laptrinhjavaweb.converter;

//converter the same mapper in jsp-servlet
//convert data tu dto -> entity and entity -> dto
import org.springframework.stereotype.Component;

import com.laptrinhjavaweb.dto.CategoryDTO;
import com.laptrinhjavaweb.entity.CategoryEntity;

//neu @Autowired class nay thi ma class nay k nam trong cac truong hop kia thi la @Component
@Component
public class CategoryConverter {
	
	public CategoryDTO toDto(CategoryEntity entity) {
		CategoryDTO result = new CategoryDTO();
		result.setId(entity.getId());
		result.setCode(entity.getCode());
		result.setName(entity.getName());
		return result;
	}
	
	public CategoryEntity toEntity(CategoryDTO dto) {
		CategoryEntity result = new CategoryEntity();
		result.setCode(dto.getCode());
		result.setName(dto.getName());
		return result;
	}
}
