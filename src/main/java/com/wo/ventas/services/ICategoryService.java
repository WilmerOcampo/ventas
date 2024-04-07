package com.wo.ventas.services;

import com.wo.ventas.entities.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> findAll();
}
