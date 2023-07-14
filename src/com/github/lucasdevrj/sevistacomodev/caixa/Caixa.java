package com.github.lucasdevrj.sevistacomodev.caixa;

import com.github.lucasdevrj.sevistacomodev.modelos.Roupa;
import com.github.lucasdevrj.sevistacomodev.principal.MenuPrincipal;
import com.github.lucasdevrj.sevistacomodev.sexta.SextaDeRoupas;

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
        } else {
            System.out.println("Opção inválida!!");
        }
    }
    public void venderRoupas(SextaDeRoupas sexta) {
        int tamanhoDaSexta = sexta.getSextaDeRoupas().size();
        if (tamanhoDaSexta > 0) {
            for (int i = 0; i < tamanhoDaSexta; i++) {
                Roupa roupa = sexta.getSextaDeRoupas().get(i);
                System.out.println("Roupa: " + roupa.getNome());
                System.out.printf("Preço: R$ %.2f\n", roupa.getPreco());
            }
            if (sexta.getDesconto() > 0.0) {
                System.out.printf("Desconto: %.2f%%\n", sexta.getDesconto());
            }
            System.out.printf("Preço Total: R$ %.2f\n", sexta.getPrecoTotalSexta());
        } else {
            System.out.println("Coloque roupas na sexta para poder compra-las!!");
        }
        exibeMenuCaixa(sexta);
    }
}
