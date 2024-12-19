package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class OperacionesServiceImpl implements OperacionesService {

    @Override
    public Integer suma(Integer num1, Integer num2) {
        return num1 + num2;
    }

    @Override
    public Integer multiplicacion(Integer num1, Integer num2) {
        return num1 * num2;
    }

    @Override
    public Integer resta(Integer num1, Integer num2) {
        return num1 - num2;
    }




}
