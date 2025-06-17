package br.com.apson.controller;

import br.com.apson.controller.menus.MenuAdm;
import br.com.apson.controller.menus.MenuAluno;
import br.com.apson.controller.menus.MenuProf;
import br.com.apson.services.SuperCadastrosService;

import java.util.Scanner;

public class LoginController {
    public static void login (){
        SuperCadastrosService pessoa = new SuperCadastrosService();
        String login;
        String senha;
        boolean loginValido = false;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Informe usuario");
            login = sc.nextLine();
            System.out.println("Informe a senha");
            senha = sc.nextLine();
            if (pessoa.validaLogin(login, senha) == null) {
                System.out.println("Login ou senha incorretos/não encontrados");
            }else if (pessoa.validaLogin(login,senha).equals("S")){
                loginValido = true;
                MenuAdm.menu();
            } else if (pessoa.validaLogin(login,senha).equals("P")) {
                loginValido = true;
                MenuProf.menu();
            } else if (pessoa.validaLogin(login, senha).equals("A")) {
                loginValido =true;
                MenuAluno.menu();
            }
        }while (!loginValido);

    }
}
