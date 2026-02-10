package com.example.shop62;

import com.example.shop62.config.AppConfig;
import com.example.shop62.processor.MessageProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        // Создаем Spring контейнер
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Получаем bean из контейнера
        MessageProcessor processor = context.getBean(MessageProcessor.class);

        // Использование
        processor.processMessage("Hello, Spring!", "test@example.com");

        // Закрываем контейнер
        ((AnnotationConfigApplicationContext) context).close();
    }
}
