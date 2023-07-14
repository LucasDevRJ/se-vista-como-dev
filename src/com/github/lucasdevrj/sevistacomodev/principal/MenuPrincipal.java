package com.github.lucasdevrj.sevistacomodev.principal;
import com.github.lucasdevrj.sevistacomodev.SextaDeRoupas;

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
        }
    }
}
