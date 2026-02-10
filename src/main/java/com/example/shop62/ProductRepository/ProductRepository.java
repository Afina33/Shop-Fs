package com.example.shop62.ProductRepository;

import com.example.shop62.model.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> getAll();
    Product addProduct(Product product);
    Product removeProduct(Product product);
    Product getBayId(Long id);
}
