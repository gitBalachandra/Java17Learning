package com.learning.api.controller;

import com.learning.api.model.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ProductController {

    private final List<Product> products = new ArrayList<>();

    public ProductController() {
        products.add(new Product(1, "Laptop", 1200.00, "Electronics"));
        products.add(new Product(2, "Coffee Mug", 15.50, "Home"));
        products.add(new Product(3, "Keyboard", 75.00, "Electronics"));
    }

    @GetMapping("/health")
    public ResponseEntity<String> health() {
        return ResponseEntity.ok("API is running");
    }

    @GetMapping("/products")
    public Map<String, Object> getProducts() {
        return getLargeResponsePayload();
    }

    @GetMapping("/large-response")
    public Map<String, Object> getLargeResponsePayload() {
        int targetBytes = 240 * 1024 * 1024;
        String chunk = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_=+/[]{}()!@#$%^&*~`|:;<>,.?/\\\"'\n";
        StringBuilder payload = new StringBuilder(targetBytes);

        while (payload.length() < targetBytes) {
            payload.append(chunk);
        }

        Map<String, Object> response = new LinkedHashMap<>();
        response.put("status", "success");
        response.put("message", "240MB response generated for frontend testing");
        response.put("sizeBytes", payload.length());
        response.put("data", payload.substring(0, targetBytes));
        return response;
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return ResponseEntity.ok(product);
            }
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/products")
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        product.setId(products.size() + 1);
        products.add(product);
        return ResponseEntity.ok(product);
    }
}
