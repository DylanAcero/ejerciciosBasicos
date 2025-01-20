package com.example.demo.controller;

import com.example.demo.service.OperacionesService;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    Document suma(@RequestParam(name = "num1") Double valor1,
                  @RequestParam(name = "num2") Double valor2) {
        return operacionesService.suma(valor1, valor2);
    }

    @GetMapping("/multiplicacion")
    ResponseEntity<?> multiplicacion(@RequestParam(name = "num1") Double valor1,
                                     @RequestParam(name = "num2") Double valor2){
        return ResponseEntity.ok().body(operacionesService.multiplicacion(valor1,valor2));
    }
    @GetMapping("/resta")
    ResponseEntity<?> resta(@RequestParam(name = "num1") Double valor1,
                            @RequestParam(name = "num2") Double valor2){
        return ResponseEntity.ok().body(operacionesService.resta(valor1,valor2));
    }

    @GetMapping("/division")
    ResponseEntity <?> division(@RequestParam(name = "num1") Double valor1,
                                @RequestParam(name = "num2") Double valor2) {
        try {
            Document res = operacionesService.division(valor1, valor2);

        } catch (ArithmeticException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage()); // En caso de error con el divisor 0
        }

        return ResponseEntity.ok().body(operacionesService.division(valor1,valor2));
    }
}
