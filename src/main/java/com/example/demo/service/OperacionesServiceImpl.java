package com.example.demo.service;

import org.bson.Document;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class OperacionesServiceImpl implements OperacionesService {

    @Override
    public Document suma(Double num1, Double num2) {
        Document ret = new Document();
        ret.put("res",num1 + num2);
        return ret;
    }

    @Override
    public Document multiplicacion(Double num1, Double num2) {
        Document ret = new Document(
                Map.of("res",num1*num2)
        );
        return ret;
    }

    @Override
    public Document resta(Double num1, Double num2) {
        return new Document(
                Map.of("res",num1-num2)
        );
    }

    @Override
    public Document division(Double num1, Double num2) {
    //Long ejemploLong = 0L;
        if (num1 == 0 && num2 == 0){
            Document Exception = new Document();
            Exception.put("Exception","Se ha utilizado un formato no valido");
            return Exception;
        }
        if (num1 == 0) {
            /*Esta es la primer solucion y no me arrojaba nada en un inicio*/
            Document ret = new Document();
            ret.put("res",0);
            return ret;
           // Si el dividendo es 0, devolvemos 0.
            //throw new ArithmeticException("0");
        }
        if (num2 == 0) {
           // throw new ArithmeticException("No se puede dividir entre 0");
            Document Exception = new Document();
            Exception.put("Exception","No se puede dividir entre 0");
            return Exception;
        }


        Document ret = new Document();
        ret.put("res",num1 / num2);
        return ret;

    }
}