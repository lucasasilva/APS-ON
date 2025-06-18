package br.com.apson.view;

import javax.swing.*;
import java.awt.*;

public class LoginView {
    public static void login (){
        JFrame frameLogin = new JFrame("login APS-ON");
        frameLogin.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frameLogin.setSize(400,100);
        frameLogin.setLocation(500,240);
        frameLogin.setResizable(false);

        JPanel painelLogin = new JPanel();
        painelLogin.setVisible(true);
        JLabel login = new JLabel("Login");
        JTextField loginInput = new JTextField(10);
        JLabel senha = new JLabel("Senha");
        JTextField senhaInput = new JPasswordField(10);
        frameLogin.setLayout(new GridLayout(1,3));

        JButton efetuarLogin = new JButton("Login");

        painelLogin.add(login);
        painelLogin.add(loginInput);
        painelLogin.add(senha);
        painelLogin.add(senhaInput);
        painelLogin.add(efetuarLogin);
        frameLogin.add(painelLogin);
        frameLogin.setVisible(true);

    }
}
