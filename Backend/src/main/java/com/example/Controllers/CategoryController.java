package com.example.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.Models.Product;
import com.example.Services.CategoryService;

@RestController
public class CategoryController {

    @Autowired
    private CategoryService service;

    
    @GetMapping("/api/categories/{cat_id}")
    public List<Product> getAllProductsByCategory(@PathVariable("cat_id") int cat_id) {
        return service.getAllProductsByCategoryId(cat_id);
    }
}
