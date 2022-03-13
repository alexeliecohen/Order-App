package com.example.orderapp.controller;

import com.example.orderapp.Service.ProductService;
import com.example.orderapp.dto.CreateProductRequest;
import com.example.orderapp.dto.ProductResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static com.example.orderapp.dto.Mapper.map;

@RestController()
@RequestMapping("/products")
public class ProductController {


    private  final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductResponse create(@RequestBody @Valid CreateProductRequest productRequest){
       return map(productService.createProduct(productRequest));
    }
}
