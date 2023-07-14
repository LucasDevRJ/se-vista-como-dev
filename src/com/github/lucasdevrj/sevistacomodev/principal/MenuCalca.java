package com.github.lucasdevrj.sevistacomodev.principal;

import com.github.lucasdevrj.sevistacomodev.SextaDeRoupas;
import com.github.lucasdevrj.sevistacomodev.modelos.Calca;

import java.util.Scanner;

public class MenuCalca {
    MenuPrincipal menuPrincipal = new MenuPrincipal();
    Calca calca1 = new Calca("Calça Slim", 119.90, "Preta",
            'M', "REQUEST",
            "Calça Slim Em Sarja Com Pregas Preto");
    Calca calca2 = new Calca("Calça Comfort", 179.90, "Verde",
            'G', "Marfinno",
            "Calça Comfort Em Sarja Com Cordão E Bolsos Verde");
    Calca camiseta3 = new Calca("Camiseta Regular", 69.90,
            "Marrom", 'M', "Ripping",
            "Camiseta Regular Básica Em Algodão Com Manga Longa Marrom");

    public void exibeMenuCamiseta(SextaDeRoupas sexta) {
        Scanner entrada = new Scanner(System.in);

        String menu = """
                -------------------|CAMISETAS|-------------------
                Nossas Camisetas:
                1 - Ver %s
                2 - Ver %s
                3 - Ver %s
                4 - Voltar
                --------------------------------------------
                """.formatted(camiseta1.getNome(), calca2.getNome(), camiseta3.getNome());
        System.out.println(menu);
        System.out.print("Digite a opção desejada: ");
        int opcao = entrada.nextInt();

        switch (opcao) {
                case 1:
                    String informacoesCamiseta = """
                                Nome: %s
                                Preço: R$ %.2f
                                Cor: %s
                                Tamanho: %s
                                Marca: %s
                                Descrição: %s
                                """.formatted(camiseta1.getNome(), camiseta1.getPreco(),
                            camiseta1.getCor(), camiseta1.getTamanho(), camiseta1.getMarca(),
                            camiseta1.getDescricao());
                    System.out.println(informacoesCamiseta);
                    sexta.adicionaNaSexta(camiseta1);
                    exibeMenuCamiseta(sexta);
                break;

                case 2:
                    informacoesCamiseta = """
                                Nome: %s
                                Preço: R$ %.2f
                                Cor: %s
                                Tamanho: %s
                                Marca: %s
                                Descrição: %s
                                """.formatted(calca2.getNome(), calca2.getPreco(),
                        calca2.getCor(), calca2.getTamanho(), calca2.getMarca(),
                        calca2.getDescricao());
                    System.out.println(informacoesCamiseta);
                    sexta.adicionaNaSexta(calca2);
                    exibeMenuCamiseta(sexta);
                break;

                case 3:
                    informacoesCamiseta = """
                                Nome: %s
                                Preço: R$ %.2f
                                Cor: %s
                                Tamanho: %s
                                Marca: %s
                                Descrição: %s
                                """.formatted(camiseta3.getNome(), camiseta3.getPreco(),
                        camiseta3.getCor(), camiseta3.getTamanho(), camiseta3.getMarca(),
                        camiseta3.getDescricao());
                    System.out.println(informacoesCamiseta);
                    sexta.adicionaNaSexta(camiseta3);
                    exibeMenuCamiseta(sexta);
                break;

                case 4:
                    menuPrincipal.exibeMenuPrincipal(sexta);
                break;

            default:
                System.out.println("Opção inválida!");
        }
    }
}
