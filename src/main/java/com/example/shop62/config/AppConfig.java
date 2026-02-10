package com.example.shop62.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // Указывает, что это конфигурационный класс
@ComponentScan(basePackages = "com.example.shop62")
public class AppConfig {
    // Spring найдет все классы с аннотацией @Component
}
