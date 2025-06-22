package br.com.apson.view;

import javax.swing.*;

public class AlunoView  {
    private final  JFrame frame = new JFrame("APS-ON");
    public  void alunoView(){
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        frame.setVisible(true);
    }
}
