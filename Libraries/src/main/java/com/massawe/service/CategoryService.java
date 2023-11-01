package com.massawe.service;

import com.massawe.dto.CategoryDto;
import com.massawe.models.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    List<Category> findAll();

    Category save(Category category);
    Category findById(Long id);

    Category update(Category category);
    void deleteById(Long id);
    void enableById(Long id);

    /*Customer*/
    List<CategoryDto> getCategoryAndProduct();
}
