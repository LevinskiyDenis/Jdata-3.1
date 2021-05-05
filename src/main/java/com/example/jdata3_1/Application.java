package com.example.jdata3_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.jdata3_1")
@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

// остановился на том, что схемаскл срабатывает, таблицы создаются,
// но при повторном запуске все падает, потому что таблицы уже есть.
// Наверное это нормально. Надо смотреть ТЗ по заданию и еще раз посмотреть,
// как у препода в видосе
