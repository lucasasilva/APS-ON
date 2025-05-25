package br.com.apson.controller.menus;

import br.com.apson.util.Menu;

import java.util.Scanner;


public class MenuProf {
    public static void menu(){
    Scanner sc = new Scanner(System.in);
        int menu;
        do {
            Menu.menu();
            menu = sc.nextInt();
            switch (menu) {
                case 1://professores

                    break;
                case 2://alunos
                    break;
                case 3: //instituições
                    break;
                case 4://Areas de atuação
                    break;
                case 5: //atividades
                    break;
                case 0:
                    System.out.println("Obrigado por usar");
                default:
                    System.out.println("opção inválida");
                    sc.nextInt();
            }

        } while (menu != 0);

    }
}
