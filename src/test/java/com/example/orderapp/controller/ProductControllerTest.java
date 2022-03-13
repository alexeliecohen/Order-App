package com.example.orderapp.controller;

import com.example.orderapp.dto.CreateProductRequest;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.*;

class ProductControllerTest extends IntegrationTest {

    @BeforeEach
    void setUp() {
        uri = "http://localhost:" +port;
    }

    @Test
    void create_shouldReturn_201_status() {
        var createRequest = new CreateProductRequest(
                faker.commerce().productName(),
                faker.job().title(),
                Double.parseDouble(faker.commerce().price())
        );

        given()
                .baseUri(uri)
                .contentType(ContentType.JSON)
                .body(createRequest)
                .when()
                .post("/products")
                .then()
                .log().all()
                .statusCode(HttpStatus.CREATED.value());
    }
}