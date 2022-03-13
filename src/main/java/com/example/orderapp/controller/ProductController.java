package com.example.orderapp.controller;

import com.example.orderapp.dto.ProductRequest;
import com.example.orderapp.dto.ProductResponse;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "products")
public class ProductController {
    public ProductResponse create(ProductRequest productRequest){
        return null;
    }
}
