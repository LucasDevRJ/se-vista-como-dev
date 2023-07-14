package com.github.lucasdevrj.sevistacomodev.calculadora;

import com.github.lucasdevrj.sevistacomodev.modelos.Roupa;
import com.github.lucasdevrj.sevistacomodev.sexta.SextaDeRoupas;

import java.util.ArrayList;

public class Calculadora {
    private double precoTotalSexta = 0;
    private double desconto = 0;

    public double getPrecoTotalSexta() {
        return precoTotalSexta;
    }
    public double getDesconto() {
        return desconto;
    }
    public double calculaPrecoTotal(Roupa roupa) {
        this.precoTotalSexta += roupa.getPreco();
        if (this.precoTotalSexta >= 300.00) {
            calculaDescontoComprasAcimaDeTrezentos();
        }
        return this.precoTotalSexta;
    }

    private double calculaDescontoComprasAcimaDeTrezentos() {
        this.desconto = 0.15;
        this.precoTotalSexta -= this.precoTotalSexta * desconto;
        return this.precoTotalSexta;
    }
}
