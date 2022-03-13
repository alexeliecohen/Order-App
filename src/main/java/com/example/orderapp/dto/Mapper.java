package com.example.orderapp.dto;

import com.example.orderapp.model.Product;

public class Mapper {
    public static ProductResponse map(Product product) {
        return new ProductResponse(
                product.getName(),
                product.getDescription(),
                product.getPrice()
        );
    }
}
