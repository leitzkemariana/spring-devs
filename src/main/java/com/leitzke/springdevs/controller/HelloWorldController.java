package com.leitzke.springdevs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("hello/{nome}/{idade}")
    public String hello(@PathVariable String nome, @PathVariable Integer idade) {
        return  "Hello, " +  nome + "\nVocê tem " + idade + " anos";
    }

    @GetMapping("/helloSpring")
    public String helloSpring(){
        return "Hello Spring!";
    }

    @GetMapping("/byeWorld")
    public String byeWorld(){
        return "Bye World!";
    }

}
