package com.devgabrielc.mywallet.services;

import com.devgabrielc.mywallet.entities.Category;
import com.devgabrielc.mywallet.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public List<Category> findCategoryById(Long categoryId) {
        return (List<Category>) categoryRepository.findById(categoryId).get();
    }

    @Override
    public List<Category> findAllCategories() {
        return (List<Category>) categoryRepository.findAll();
    }

    @Override
    public Category updateCategory(Category category, Long categoryId) {
        Category categoryDB = categoryRepository.findById(categoryId).get();

        if (Objects.nonNull(category.getCategoryName()) && !"".equalsIgnoreCase(category.getCategoryName())) {
            categoryDB.setCategoryName(category.getCategoryName());
        }

        if (Objects.nonNull(category.getCategoryColor()) && !"".equalsIgnoreCase(String.valueOf(category.getCategoryColor()))) {
            categoryDB.setCategoryColor(category.getCategoryColor());
        }

        return categoryRepository.save(categoryDB);
    }

    @Override
    public void deleteCategoryById(Long categoryId) {
        categoryRepository.deleteById(categoryId);
    }
}
