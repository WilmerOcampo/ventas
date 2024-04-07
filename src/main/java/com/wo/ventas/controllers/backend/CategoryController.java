package com.wo.ventas.controllers.backend;

import com.wo.ventas.entities.Category;
import com.wo.ventas.services.ICategoryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/category")
@AllArgsConstructor
public class CategoryController {
    private final ICategoryService categoryService;

    @GetMapping("/all")
    public String categories(Model model){
        List<Category> categories = categoryService.findAll();
        model.addAttribute("categories", categories);
        return "backend/categories";
    }
}
