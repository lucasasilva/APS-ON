package br.com.apson.controller;

import br.com.apson.services.SuperCadastrosService;

public class LoginController {
    SuperCadastrosService pessoa = new SuperCadastrosService();
    public String validaLogin(String login, String senha){
        return pessoa.validaLogin(login, senha);
    }
}
