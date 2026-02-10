package com.example.shop62;

import com.example.shop62.model.*;
import com.example.shop62.ProductRepository.ProductRepository;
import com.example.shop62.ProductRepository.ProductRepositoryMap;

import java.math.BigDecimal;



public class ShopDemo {
    public static void main(String[] args) {
        Product ipad = new Product(
                "iPad Air 5",
                "Планшет Apple iPad Air 5-го поколения",
                new BigDecimal("45999.99"),
                8,
                ProductStatus.ACTIVE,
                new Category(5L, "tablet"),
                "https://example.com/images/ipad_air_5.jpg"
        );

        ProductRepository repository = new ProductRepositoryMap();

        repository.addProduct(ipad);

        repository.getAll().forEach(System.out::println);

    }

}
