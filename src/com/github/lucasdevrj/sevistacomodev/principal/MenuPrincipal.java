package com.github.lucasdevrj.sevistacomodev.principal;
import com.github.lucasdevrj.sevistacomodev.modelos.Roupa;

import java.util.ArrayList;
import java.util.Scanner;
public class MenuPrincipal {
    public static void main(String[] args) {
        ArrayList<Roupa> sextaDeRoupas = new ArrayList<Roupa>();
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        menuPrincipal.exibeMenuPrincipal(sextaDeRoupas);
    }
    public void exibeMenuPrincipal(ArrayList<Roupa> sexta) {
        Scanner entrada = new Scanner(System.in);

        String menu = """
                Bem-vindo(a) a loja Se Vista como Dev!
                -------------------|MENU|-------------------
                Nossas Vestimentas:
                1 - Ver Camisetas
                2 - Ver Calças
                3 - Ver Calçados
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
        }
    }
}
