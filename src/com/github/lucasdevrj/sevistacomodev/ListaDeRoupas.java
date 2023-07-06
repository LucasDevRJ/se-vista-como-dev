package com.github.lucasdevrj.sevistacomodev;

import com.github.lucasdevrj.sevistacomodev.modelos.Roupa;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeRoupas {
    private ArrayList<Roupa> sextaDeRoupas = new ArrayList<Roupa>();
    public void adicionaNaSexta(Roupa roupa) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Você deseja adicionar na sexta?\n1 - Sim ou 2 - Não: ");
        int opcao = entrada.nextInt();

        while (opcao != 1 && opcao != 2) {
            System.out.println("Digite somente 1 ou 2!!");
            System.out.print("Você deseja adicionar na sexta?\n1 - Sim ou 2 - Não: ");
            opcao = entrada.nextInt();
        }

        if (opcao == 1) {
            sextaDeRoupas.add(roupa);
            System.out.println("A " + roupa.getNome() + " foi adiciona na sexta!!");
        }
    }
}
