package com.example.demo.controller;

import com.example.demo.service.OperacionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/operaciones")
public class OperacionesController {

    @Autowired
    private OperacionesService operacionesService;

    @GetMapping("/suma")
    Integer suma(@RequestParam(name = "num1") Integer valor1,
                 @RequestParam(name = "num2") Integer valor2) {
        return operacionesService.suma(valor1, valor2);
    }


}
