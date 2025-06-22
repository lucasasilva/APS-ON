package br.com.apson.view;

import br.com.apson.controller.LoginController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;

public class LoginView implements ActionListener, LoginInterface{
    LoginController loginController = new LoginController();
    private final AlunoView alunoView = new AlunoView();
    private final AdmView admView = new AdmView();
    private  final ProfessorView professorView = new ProfessorView();

    private final JFrame frameLogin = new JFrame("APS-ON");
    private final JTextField loginInput = new JTextField(10);
    private final JTextField senhaInput = new JPasswordField(10);

    @Override
    public void login() {
        frameLogin.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frameLogin.setSize(400, 100);
        frameLogin.setLocation(500, 240);
        frameLogin.setResizable(false);

        JPanel painelLogin = new JPanel();
        painelLogin.setVisible(true);
        JLabel login = new JLabel("Login");
        JLabel senha = new JLabel("Senha");
        frameLogin.setLayout(new GridLayout(1, 3));

        JButton efetuarLogin = new JButton("Login");
        efetuarLogin.addActionListener(this);

        painelLogin.add(login);
        painelLogin.add(loginInput);
        painelLogin.add(senha);
        painelLogin.add(senhaInput);
        painelLogin.add(efetuarLogin);
        frameLogin.add(painelLogin);
        frameLogin.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String login = loginInput.getText();
        String senha = senhaInput.getText();
        String tipoLogin = loginController.validaLogin(login, senha);
        if (tipoLogin == null) {
            JOptionPane.showMessageDialog(null, "Login ou senha incorretos");
        } else if (tipoLogin.equalsIgnoreCase("s")) {
            admView.admView();
            frameLogin.dispose();
        } else if (tipoLogin.equalsIgnoreCase("p")) {
            professorView.professorView();
            frameLogin.dispose();
        } else if (tipoLogin.equalsIgnoreCase("a")) {
            alunoView.alunoView();
            frameLogin.dispose();
        }
    }

}
