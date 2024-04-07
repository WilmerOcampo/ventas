package com.wo.ventas.services;

import com.wo.ventas.entities.Category;
import com.wo.ventas.repositories.ICategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoryServiceImpl implements ICategoryService {
    private final ICategoryRepository categoryRepos;

    @Override
    public List<Category> findAll() {
        return categoryRepos.findAll();
    }
}
