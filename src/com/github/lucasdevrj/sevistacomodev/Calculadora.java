package com.github.lucasdevrj.sevistacomodev;

import com.github.lucasdevrj.sevistacomodev.modelos.Roupa;
import com.github.lucasdevrj.sevistacomodev.sexta.SextaDeRoupas;

import java.util.ArrayList;

public class Calculadora {
    private double precoTotalSexta = 0;

    public double getPrecoTotalSexta() {
        return precoTotalSexta;
    }

    public double calculaPrecoTotal(Roupa roupa) {
        this.precoTotalSexta += roupa.getPreco();
        System.out.println("Calculadora");
        return this.precoTotalSexta;
    }
}
