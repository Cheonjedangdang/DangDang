package com.dangdangcompany.dangdang.category.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dangdangcompany.dangdang.category.dao.CategoryDAO;
import com.dangdangcompany.dangdang.category.dto.CategoryDTO;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryDAO categoryDao;
	
	public ArrayList<CategoryDTO> CategoryList(){
		return categoryDao.selectAll();
	}
	public ArrayList<CategoryDTO> CategoryComicList(){
		return categoryDao.selectType(1);
	}
	public ArrayList<CategoryDTO> CategoryGameList(){
		return categoryDao.selectType(2);
	}
	public CategoryDTO getCategoryDetail(int categoryId) {
		return categoryDao.select(categoryId);
	}
}
