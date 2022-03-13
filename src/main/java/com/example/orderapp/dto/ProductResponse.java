package com.example.orderapp.dto;

public record ProductResponse(
        String name,
        String description,
        double price
) {
}