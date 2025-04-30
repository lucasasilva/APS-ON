package br.com.apson.controller;

import br.com.apson.repository.SuperCadastrosInterface;
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
            if (pessoa.validaLogin(login,senha)){
                loginValido = true;
            }
            if(loginValido){
                MenuController.menu();
            }
        }while (!loginValido);

    }
}
