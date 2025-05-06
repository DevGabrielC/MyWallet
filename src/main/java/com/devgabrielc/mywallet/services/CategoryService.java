package com.devgabrielc.mywallet.services;

import com.devgabrielc.mywallet.entities.Category;

import java.util.List;

public interface CategoryService {
    Category saveCategory(Category category);

    List<Category> findAllCategories();

    List<Category> findCategoryById(Long categoryId);

    Category updateCategory(Category category, Long categoryId);

    void deleteCategoryById(Long categoryId);
}
