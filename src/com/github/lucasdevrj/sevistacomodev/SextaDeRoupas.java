package com.github.lucasdevrj.sevistacomodev;

import com.github.lucasdevrj.sevistacomodev.modelos.Roupa;

import java.util.ArrayList;
import java.util.Scanner;

public class SextaDeRoupas {
    private ArrayList<Roupa> sextaDeRoupas = new ArrayList<Roupa>();
    public void exibeMenuSexta() {
        String menu = """
                -------------------|SEXTA|-------------------
                Opções do Menu:
                1 - Ver Roupas
                2 - Remover Alguma Peça de Roupa
                3 - Remover Todas as Peças de Roupa
                4 - Voltar
                """;
        System.out.println(menu);
    }
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
    public void exibeRoupasDaSexta() {
        if (!sextaDeRoupas.isEmpty()) {
            for (Roupa roupa : sextaDeRoupas) {
                String informacoes = """
                    Nome: %s
                    Preço: %.2f
                    Descrição: %s
                    """.formatted(roupa.getNome(), roupa.getPreco(), roupa.getDescricao());
                System.out.println(informacoes);
            }
        } else {
            System.out.println("A sexta está vazia!!");
        }
    }
}
