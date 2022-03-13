package com.example.orderapp.Service;

import com.example.orderapp.dto.CreateProductRequest;
import com.example.orderapp.model.Product;
import com.example.orderapp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public Product createProduct(CreateProductRequest productRequest) {
        var product = Product.builder()
                .name(productRequest.name())
                .price(productRequest.price())
                .description(productRequest.description())
                .build();
        productRepository.save(product);
        return product;
    }
}
