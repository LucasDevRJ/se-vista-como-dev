package com.github.lucasdevrj.sevistacomodev.principal;

import com.github.lucasdevrj.sevistacomodev.modelos.Camiseta;

import java.util.Scanner;

public class MenuCamiseta {
    Camiseta camiseta1 = new Camiseta("Camiseta Relaxed", 99.90, "Branca",
            'M', "Blue Steel",
            "Camiseta Relaxed Em Algodão Com Gola Média E Manga Curta Branco");
    public static void main(String[] args) {
        MenuCamiseta menuCamiseta = new MenuCamiseta();
        menuCamiseta.exibeMenuCamiseta();
    }

    public void exibeMenuCamiseta() {
        Scanner entrada = new Scanner(System.in);

        String menu = """
                -------------------|CAMISETAS|-------------------
                Nossas Camisetas:
                1 - Ver %s
                2 - Ver 
                3 - Ver 
                4 - Voltar
                --------------------------------------------
                """.formatted(camiseta1.getNome());
        System.out.println(menu);
        System.out.print("Digite a opção desejada: ");
        int opcao = entrada.nextInt();
    }
}
