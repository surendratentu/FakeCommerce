package com.example.FakeCommerce.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.FakeCommerce.services.ProductService;
import com.example.FakeCommerce.schema.Product;
import com.example.FakeCommerce.dtos.CreateProductRequestDto;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping
    public Product createProduct(@RequestBody CreateProductRequestDto requestdto) {
        return productService.createProduct(requestdto);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }

    @GetMapping("/search")
    public List<Product> getProductsByCategory(@RequestParam("categoryName") String category) {
        return productService.getProductsByCategory(category);
    }

    @GetMapping("/categories")
    public List<String> getDistinctCategories() {
        return productService.getDistinctCategories();
    }

}
