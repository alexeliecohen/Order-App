package com.example.orderapp.Service;

import com.example.orderapp.dto.ProductRequest;
import com.example.orderapp.model.Product;

public class ProductService {

    public Product createProduct(ProductRequest productRequest) {
        Product.builder()
                .name()
                .price()
                .description()
                .build();

        return null;
    }
}
