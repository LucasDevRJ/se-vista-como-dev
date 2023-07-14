package com.github.lucasdevrj.sevistacomodev.principal;

import com.github.lucasdevrj.sevistacomodev.SextaDeRoupas;
import com.github.lucasdevrj.sevistacomodev.modelos.Calcado;

import java.util.Scanner;

public class MenuCalcado {
    MenuPrincipal menuPrincipal = new MenuPrincipal();
    Calcado calcado1 = new Calcado("Tênis Street", 159.90, "Preta",
            "40", "Viko",
            "Tênis Street Cano Baixo Com Recortes E Cadarço Preto");
    Calcado calcado2 = new Calcado("Tênis Slip", 159.90, "Bege",
            "42", "Viko",
            "Tênis Slip On Em Couro Com Elástico E Recortes Bege");
    Calcado calcado3 = new Calcado("Tênis Vulcan", 139.90,
            "Cinza", "40", "Viko",
            "Tênis Vulcan Cano Baixo Com Ponteira Texturizada Bege");
    public void exibeMenuCalcado(SextaDeRoupas sexta) {
        Scanner entrada = new Scanner(System.in);
        String menu = """
                -------------------|CAMISETAS|-------------------
                Nossos Calçados:
                1 - Ver %s
                2 - Ver %s
                3 - Ver %s
                4 - Voltar
                --------------------------------------------
                """.formatted(calcado1.getNome(), calcado2.getNome(), calcado3.getNome());
        System.out.println(menu);
        System.out.print("Digite a opção desejada: ");
        int opcao = entrada.nextInt();

        switch (opcao) {
                case 1:
                    String informacoesCalcados = """
                                Nome: %s
                                Preço: R$ %.2f
                                Cor: %s
                                Tamanho: %s
                                Marca: %s
                                Descrição: %s
                                """.formatted(calcado1.getNome(), calcado1.getPreco(),
                            calcado1.getCor(), calcado1.getTamanho(), calcado1.getMarca(),
                            calcado1.getDescricao());
                    System.out.println(informacoesCalcados);
                    sexta.adicionaNaSexta(calcado1);
                    exibeMenuCalcado(sexta);
                break;

                case 2:
                    informacoesCalcados = """
                                Nome: %s
                                Preço: R$ %.2f
                                Cor: %s
                                Tamanho: %s
                                Marca: %s
                                Descrição: %s
                                """.formatted(calcado2.getNome(), calcado2.getPreco(),
                        calcado2.getCor(), calcado2.getTamanho(), calcado2.getMarca(),
                        calcado2.getDescricao());
                    System.out.println(informacoesCalcados);
                    sexta.adicionaNaSexta(calcado2);
                    exibeMenuCalcado(sexta);
                break;

                case 3:
                    informacoesCalcados = """
                                Nome: %s
                                Preço: R$ %.2f
                                Cor: %s
                                Tamanho: %s
                                Marca: %s
                                Descrição: %s
                                """.formatted(calcado3.getNome(), calcado3.getPreco(),
                        calcado3.getCor(), calcado3.getTamanho(), calcado3.getMarca(),
                        calcado3.getDescricao());
                    System.out.println(informacoesCalcados);
                    sexta.adicionaNaSexta(calcado3);
                    exibeMenuCalcado(sexta);
                break;

                case 4:
                    menuPrincipal.exibeMenuPrincipal(sexta);
                break;

            default:
                System.out.println("Opção inválida!");
        }
    }
}
