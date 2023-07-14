package com.github.lucasdevrj.sevistacomodev.principal;

import com.github.lucasdevrj.sevistacomodev.SextaDeRoupas;
import com.github.lucasdevrj.sevistacomodev.modelos.Calca;

import java.util.Scanner;

public class MenuCalca {
    MenuPrincipal menuPrincipal = new MenuPrincipal();
    Calca calca1 = new Calca("Calça Slim", 119.90, "Preta",
            "M", "REQUEST",
            "Calça Slim Em Sarja Com Pregas Preto");
    Calca calca2 = new Calca("Calça Comfort", 179.90, "Verde",
            "G", "Marfinno",
            "Calça Comfort Em Sarja Com Cordão E Bolsos Verde");
    Calca calca3 = new Calca("Calça Slim", 159.90,
            "Azul Claro", "M", "Marfinno",
            "Calça Slim Básica Jeans Com Bolsos Azul Claro");

    public void exibeMenuCalca(SextaDeRoupas sexta) {
        Scanner entrada = new Scanner(System.in);

        String menu = """
                -------------------|CAMISETAS|-------------------
                Nossas Calças:
                1 - Ver %s
                2 - Ver %s
                3 - Ver %s
                4 - Voltar
                --------------------------------------------
                """.formatted(calca1.getNome(), calca2.getNome(), calca3.getNome());
        System.out.println(menu);
        System.out.print("Digite a opção desejada: ");
        int opcao = entrada.nextInt();

        switch (opcao) {
                case 1:
                    String informacoesCalcas = """
                                Nome: %s
                                Preço: R$ %.2f
                                Cor: %s
                                Tamanho: %s
                                Marca: %s
                                Descrição: %s
                                """.formatted(calca1.getNome(), calca1.getPreco(),
                            calca1.getCor(), calca1.getTamanho(), calca1.getMarca(),
                            calca1.getDescricao());
                    System.out.println(informacoesCalcas);
                    sexta.adicionaNaSexta(calca1);
                    exibeMenuCalca(sexta);
                break;

                case 2:
                    informacoesCalcas = """
                                Nome: %s
                                Preço: R$ %.2f
                                Cor: %s
                                Tamanho: %s
                                Marca: %s
                                Descrição: %s
                                """.formatted(calca2.getNome(), calca2.getPreco(),
                        calca2.getCor(), calca2.getTamanho(), calca2.getMarca(),
                        calca2.getDescricao());
                    System.out.println(informacoesCalcas);
                    sexta.adicionaNaSexta(calca2);
                    exibeMenuCalca(sexta);
                break;

                case 3:
                    informacoesCalcas = """
                                Nome: %s
                                Preço: R$ %.2f
                                Cor: %s
                                Tamanho: %s
                                Marca: %s
                                Descrição: %s
                                """.formatted(calca3.getNome(), calca3.getPreco(),
                        calca3.getCor(), calca3.getTamanho(), calca3.getMarca(),
                        calca3.getDescricao());
                    System.out.println(informacoesCalcas);
                    sexta.adicionaNaSexta(calca3);
                    exibeMenuCalca(sexta);
                break;

                case 4:
                    menuPrincipal.exibeMenuPrincipal(sexta);
                break;

            default:
                System.out.println("Opção inválida!");
        }
    }
}
