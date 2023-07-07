package com.github.lucasdevrj.sevistacomodev;

import com.github.lucasdevrj.sevistacomodev.modelos.Roupa;
import com.github.lucasdevrj.sevistacomodev.principal.MenuPrincipal;

import java.util.ArrayList;
import java.util.Scanner;

public class SextaDeRoupas {
    private ArrayList<Roupa> sextaDeRoupas = new ArrayList<Roupa>();
    Scanner entrada = new Scanner(System.in);
    MenuPrincipal menuPrincipal = new MenuPrincipal();
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
                    //exibeRoupasDaSexta();
                break;

                case 4:
                    menuPrincipal.exibeMenuPrincipal(sexta);
                break;
        }
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
    public void exibeRoupasDaSexta(SextaDeRoupas sexta) {
        if (!sextaDeRoupas.isEmpty()) {
            for (int i = 0; i < this.sextaDeRoupas.size(); i++) {
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
            System.out.println("Digite o número da roupa que deseja remover: ");
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
