package com.github.lucasdevrj.sevistacomodev.principal;
import com.github.lucasdevrj.sevistacomodev.caixa.Caixa;
import com.github.lucasdevrj.sevistacomodev.sexta.SextaDeRoupas;

import java.util.Scanner;
public class MenuPrincipal {
    public static void main(String[] args) {
        SextaDeRoupas sextaDeRoupas = new SextaDeRoupas();
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        menuPrincipal.exibeMenuPrincipal(sextaDeRoupas);
    }
    public void exibeMenuPrincipal(SextaDeRoupas sexta) {
        Scanner entrada = new Scanner(System.in);

        String menu = """
                Bem-vindo(a) a loja Se Vista como Dev!
                -------------------|MENU|-------------------
                Nossas Vestimentas:
                1 - Ver Camisetas
                2 - Ver Calças
                3 - Ver Calçados
                4 - Ver Sexta
                5 - Caixa
                6 - Sair
                --------------------------------------------
                """;
        System.out.println(menu);
        System.out.print("Digite a opção desejada: ");
        int opcao = entrada.nextInt();

        switch (opcao) {
                case 1:
                    MenuCamiseta menuCamiseta = new MenuCamiseta();
                    menuCamiseta.exibeMenuCamiseta(sexta);
                break;

                case 2:
                    MenuCalca menuCalca = new MenuCalca();
                    menuCalca.exibeMenuCalca(sexta);
                break;

                case 3:
                    MenuCalcado menuCalcado = new MenuCalcado();
                    menuCalcado.exibeMenuCalcado(sexta);
                break;

                case 4:
                    sexta.exibeMenuSexta(sexta);
                break;

                case 5:
                    Caixa caixa = new Caixa();
                    caixa.exibeMenuCaixa(sexta);
                break;

                case 6:
                    finalizaPrograma(sexta);
                break;

                default:
                    System.out.println("Opção inválida!!");
        }
    }

    private void finalizaPrograma(SextaDeRoupas sexta) {
        if (sexta.getSextaDeRoupas().isEmpty()) {
            System.out.println("Programa finalizado.");
        } else {
            System.out.println("Compre ou esvazia a sexta para poder finalizar o programa!!");
            exibeMenuPrincipal(sexta);
        }
    }
}
