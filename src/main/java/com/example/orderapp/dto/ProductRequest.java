package com.example.orderapp.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public record ProductRequest(
        @NotBlank
        String name,

        @NotBlank
        String description,

        @Min(value = 0)
        double price
) {
}
