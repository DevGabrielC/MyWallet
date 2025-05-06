package com.devgabrielc.mywallet.controllers;

import com.devgabrielc.mywallet.entities.Category;
import com.devgabrielc.mywallet.services.CategoryService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping("/new-category")
    public Category saveCategory(@Valid @RequestBody Category category) {
        return categoryService.saveCategory(category);
    }

    @GetMapping("/categories")
    public List<Category> getAllCategories() {
        return categoryService.findAllCategories();
    }

    @GetMapping("/categories/{id}")
    public List<Category> getCategoryById(@Valid @PathVariable("id") Long categoryId) {
        return categoryService.findCategoryById(categoryId);
    }

    @PutMapping("/categories/{id}")
    public Category updateCategory(@Valid @RequestBody Category category, @PathVariable("id") Long categoryId) {
        return categoryService.updateCategory(category, categoryId);
    }

    @DeleteMapping("/categories/{id}")
    public String deleteCategoryById(@Valid @PathVariable("id") Long categoryId) {
        categoryService.deleteCategoryById(categoryId);
        return "Deleted Successfully";
    }
}
