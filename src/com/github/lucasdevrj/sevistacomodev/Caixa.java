package com.github.lucasdevrj.sevistacomodev;

import com.github.lucasdevrj.sevistacomodev.modelos.Roupa;
import com.github.lucasdevrj.sevistacomodev.principal.MenuPrincipal;
import com.github.lucasdevrj.sevistacomodev.sexta.SextaDeRoupas;

import java.util.ArrayList;
import java.util.Scanner;

public class Caixa {
    Scanner entrada = new Scanner(System.in);
    public void exibeMenuCaixa(SextaDeRoupas sexta) {
        String menu = """
                1 - Comprar Roupas
                2 - Voltar
                """;
        System.out.println(menu);
        System.out.print("Digite a opção desejada: ");
        int opcao = entrada.nextInt();

        if (opcao == 1) {
            venderRoupas(sexta);
        } else if (opcao == 2) {
            MenuPrincipal menuPrincipal = new MenuPrincipal();
            menuPrincipal.exibeMenuPrincipal(sexta);
        }
    }
    public void venderRoupas(SextaDeRoupas sexta) {
        int tamanhoDaSexta = sexta.getSextaDeRoupas().size();
        for (int i = 0; i < tamanhoDaSexta; i++) {
            Roupa roupa = sexta.getSextaDeRoupas().get(i);
            System.out.println("Roupa: " + roupa.getNome());
            System.out.printf("\nPreço: R$ %.2f",roupa.getPreco());
        }
        System.out.printf("\nPreço Total: R$ %.2f", sexta.getPrecoTotalSexta());

    }
}
