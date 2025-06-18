package br.com.apson.controller;

import br.com.apson.controller.menus.MenuAdm;
import br.com.apson.controller.menus.MenuAluno;
import br.com.apson.controller.menus.MenuProf;
import br.com.apson.model.entities.SuperCadastros;
import br.com.apson.services.SuperCadastrosService;

import javax.swing.*;
import java.util.List;
import java.util.Scanner;

public class LoginController {
    SuperCadastrosService pessoa = new SuperCadastrosService();
    public String validaLogin(String login, String senha){
        return pessoa.validaLogin(login, senha);
    }
}
