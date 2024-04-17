package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@SpringBootApplication
public class Demo55Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo55Application.class, args);
    }


        @GetMapping("/get-name")
        public String getName(@RequestParam("name") String name) {
            return "Hello, " + name + "!";
        }

        @PostMapping("/reverse-name")
        public String reverseName(@RequestParam("name") String name) {
            StringBuilder reversedName = new StringBuilder(name).reverse();
            return "Reversed name: " + reversedName;
        }
    }


