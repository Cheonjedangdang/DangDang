package com.dangdangcompany.dangdang.category.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.dangdangcompany.dangdang.category.dto.CategoryDTO;

@Repository
public interface CategoryDAO {
	void insert(CategoryDTO board);
	CategoryDTO select(int boardcategoryId);
	ArrayList<CategoryDTO> selectAll();
	ArrayList<CategoryDTO> selectType(int type);
	
}
