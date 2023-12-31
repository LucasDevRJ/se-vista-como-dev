package com.github.lucasdevrj.sevistacomodev.sexta;

import com.github.lucasdevrj.sevistacomodev.calculadora.Calculadora;
import com.github.lucasdevrj.sevistacomodev.modelos.Roupa;
import com.github.lucasdevrj.sevistacomodev.principal.MenuPrincipal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SextaDeRoupas {
    private ArrayList<Roupa> sextaDeRoupas = new ArrayList<Roupa>();
    Scanner entrada = new Scanner(System.in);
    MenuPrincipal menuPrincipal = new MenuPrincipal();
    Calculadora calculadora = new Calculadora();

    public double getPrecoTotalSexta() {
        return calculadora.getPrecoTotalSexta();
    }
    public double getDesconto() {
        return calculadora.getDesconto() * 100;
    }
    public ArrayList<Roupa> getSextaDeRoupas() {
        return sextaDeRoupas;
    }
    public void exibeMenuSexta(SextaDeRoupas sexta) {
        String menu = """
                -------------------|SEXTA|-------------------
                Opções do Menu:
                1 - Ver Roupas
                2 - Remover Alguma Peça de Roupa
                3 - Remover Todas as Peças de Roupa
                4 - Voltar
                """;
        System.out.println(menu);
        System.out.print("Digite a opção desejada: ");
        int opcao = entrada.nextInt();

        switch (opcao) {
                case 1:
                    exibeRoupasDaSexta(sexta);
                break;

                case 2:
                    removerPecaDeRoupa(sexta);
                break;

                case 3:
                    removeTodasPecasDeRoupa(sexta);
                break;

                case 4:
                    menuPrincipal.exibeMenuPrincipal(sexta);
                break;

            default:
                System.out.println("Opção inválida!");
                exibeRoupasDaSexta(sexta);
        }
    }

    public void removeTodasPecasDeRoupa(SextaDeRoupas sexta) {
        if (!sexta.getSextaDeRoupas().isEmpty()) {
            this.sextaDeRoupas.clear();
            System.out.println("Todas as peças de roupas foram removidas da sexta!");
        } else {
            System.out.println("A sexta já está vázia!!");
        }
        exibeMenuSexta(sexta);
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
            calculadora.calculaPrecoTotal(roupa);
            System.out.println("A " + roupa.getNome() + " foi adiciona na sexta!!");
        }
    }
    public void exibeRoupasDaSexta(SextaDeRoupas sexta) {
        if (!sextaDeRoupas.isEmpty()) {
            for (int i = 0; i < this.sextaDeRoupas.size(); i++) {
                Collections.sort(this.sextaDeRoupas);
                Roupa roupa = this.sextaDeRoupas.get(i);
                String informacoes = """
                    Posição: %d
                    Nome: %s
                    Preço: %.2f
                    Descrição: %s
                    """.formatted(i+1, roupa.getNome(), roupa.getPreco(), roupa.getDescricao());
                System.out.println(informacoes);
            }
        } else {
            System.out.println("A sexta está vazia!!");
        }
        exibeMenuSexta(sexta);
    }
    public void removerPecaDeRoupa(SextaDeRoupas sexta) {
        if (!this.sextaDeRoupas.isEmpty()) {
            System.out.print("Digite o número da roupa que deseja remover: ");
            int opcao = entrada.nextInt();
            for (int i = 0; i < this.sextaDeRoupas.size(); i++) {
                if (opcao == i+1) {
                    System.out.println("A roupa " + this.sextaDeRoupas.get(i).getNome() + " foi removida com sucesso!");
                    this.sextaDeRoupas.remove(opcao-1);
                }
            }
        } else {
            System.out.println("A sexta de roupa está vazia!!");
        }
        exibeMenuSexta(sexta);
    }
}
