package com.example.demo.service;

import org.bson.Document;

public interface OperacionesService {

    Document suma(Double num1, Double num2);

    Document multiplicacion(Double num1, Double num2);

    Document resta(Double num1, Double num2);

    Document division(Double num1, Double num2);
}
