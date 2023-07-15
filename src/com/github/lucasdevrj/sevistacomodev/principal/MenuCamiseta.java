package com.github.lucasdevrj.sevistacomodev.principal;

import com.github.lucasdevrj.sevistacomodev.sexta.SextaDeRoupas;
import com.github.lucasdevrj.sevistacomodev.modelos.Camiseta;

import java.util.Scanner;

public class MenuCamiseta {
    MenuPrincipal menuPrincipal = new MenuPrincipal();
    Camiseta camiseta1 = new Camiseta("Camiseta Relaxed", 99.90, "Branca",
            "M", "Blue Steel",
            "Camiseta Relaxed Em Algodão Com Gola Média E Manga Curta Branco");
    Camiseta camiseta2 = new Camiseta("Camiseta Regular", 59.90, "Preta",
            "G", "Ripping",
            "Camiseta Regular Em Algodão Com Estampa De Triângulo E Lettering Preto");
    Camiseta camiseta3 = new Camiseta("Camiseta Regular", 69.90,
            "Marrom", "M", "Ripping",
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
                """.formatted(camiseta1.getNome(), camiseta2.getNome(), camiseta3.getNome());
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
                                """.formatted(camiseta2.getNome(), camiseta2.getPreco(),
                        camiseta2.getCor(), camiseta2.getTamanho(), camiseta2.getMarca(),
                        camiseta2.getDescricao());
                    System.out.println(informacoesCamiseta);
                    sexta.adicionaNaSexta(camiseta2);
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
