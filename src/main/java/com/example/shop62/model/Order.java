package com.example.shop62.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private Long id;
    private User user;
    private BigDecimal totalAmount;
    private LocalDateTime cratedAt;
    private  String shippingAddress;
    private OrderStatus status;
    private List<OrderItem> items;
}
