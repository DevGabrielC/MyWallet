package com.devgabrielc.mywallet.repositories;

import com.devgabrielc.mywallet.entities.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
}