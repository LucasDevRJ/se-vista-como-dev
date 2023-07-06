package com.github.lucasdevrj.sevistacomodev.principal;

import com.github.lucasdevrj.sevistacomodev.modelos.Camiseta;

import java.util.Scanner;

public class MenuCamiseta {
    Camiseta camiseta1 = new Camiseta("Camiseta Relaxed", 99.90, "Branca",
            'M', "Blue Steel",
            "Camiseta Relaxed Em Algodão Com Gola Média E Manga Curta Branco");
    Camiseta camiseta2 = new Camiseta("Camiseta Regular", 59.90, "Preta",
            'G', "Ripping",
            "Camiseta Regular Em Algodão Com Estampa De Triângulo E Lettering Preto");
    Camiseta camiseta3 = new Camiseta("Camiseta Regular", 69.90,
            "Marrom", 'M', "Ripping",
            "Camiseta Regular Básica Em Algodão Com Manga Longa Marrom");
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
                2 - Ver %s
                3 - Ver %s
                4 - Voltar
                --------------------------------------------
                """.formatted(camiseta1.getNome(), camiseta2.getNome(), camiseta3.getNome());
        System.out.println(menu);
        System.out.print("Digite a opção desejada: ");
        int opcao = entrada.nextInt();
    }
}
