package br.com.apson.view;

import br.com.apson.controller.Controller;

import javax.swing.*;
import java.awt.*;

public class FramePadrao {
    Controller controller = new Controller();
    private JFrame frame = new JFrame("APS-ON");
    public JMenuBar menuBar = new JMenuBar();

    public JMenu cadastros = new JMenu("Cadastros");
    public JMenu atividades = new JMenu("Atividades");

    public JMenu areaAtuacao = new JMenu("Areas Medicas");
    JMenuItem cadastrarArea = new JMenuItem("Cadastrar Area");

    public JMenu instituicaoAtuacao = new JMenu("Instituições");
    JMenuItem cadastrarInstituicao = new JMenuItem("Cadastrar Instituição");

    public JMenu professores = new JMenu("Professores");
    JMenuItem cadastrarProfessor = new JMenuItem("Cadastrar professores");
    public JMenu alunos = new JMenu("Alunos");
    JMenuItem cadastrarAlunos = new JMenuItem("Cadastrar Alunos");

    JMenuItem cadastrarAtividade= new JMenuItem("Cadastrar atividade");

    private final JDesktopPane desktopPane = new JDesktopPane();
    private  final JDesktopPane instAtu = new JDesktopPane();

    public FramePadrao() {
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);

        //formulario de cadastro de area de atuação;
        cadastrarArea.addActionListener( area -> {
            JInternalFrame cadastrarArea = new JInternalFrame("Cadastrar area", false, true, false);
            cadastrarArea.setSize(200, 100);
            cadastrarArea.setLocation(600,300);
            cadastrarArea.setLayout(new GridLayout(2,2 ));
            JButton salvar = new JButton("Salvar");
            cadastrarArea.add(new JLabel("Nome Area"));
            JTextField nome = new JTextField(20);
            cadastrarArea.add(nome);
            salvar.addActionListener(cadArea->{
                try {
                    controller.cadastrarAreaAtuacao(String.valueOf(nome.getText()));
                    JOptionPane.showMessageDialog(cadastrarArea, "Instituição cadastrada com sucesso");
                    //faz dispose porque eu ainda não aprendi a limpar a tela para reinserção;
                    cadastrarArea.dispose();
                }catch (IllegalArgumentException ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro ao salvar", JOptionPane.ERROR_MESSAGE);
                }

            });
            cadastrarArea.add(salvar);
            cadastrarArea.setVisible(true);
            desktopPane.add(cadastrarArea);
        });
        areaAtuacao.add(cadastrarArea);
        cadastros.add(areaAtuacao);

        //instituição de atuação
        cadastrarInstituicao.addActionListener(instituicao ->{
            JInternalFrame cadastrarInstituicao = new JInternalFrame("Cadastrar Instituição", false, true, false);
            cadastrarInstituicao.setSize(200, 100);
            cadastrarInstituicao.setLocation(600,300);
            cadastrarInstituicao.setLayout(new GridLayout(2,2 ));
            JButton salvar = new JButton("Salvar");
            cadastrarInstituicao.add(new JLabel("Nome Area"));
            JTextField nome = new JTextField(20);
            cadastrarInstituicao.add(nome);
            salvar.addActionListener(cadastrarInst->{
                try {
                    controller.cadastrarInstituicao(String.valueOf(nome.getText()));
                    JOptionPane.showMessageDialog(cadastrarArea, "Instituição cadastrada com sucesso");
                    //faz dispose porque eu ainda não aprendi a limpar a tela para reinserção;
                    cadastrarInstituicao.dispose();
                }catch (IllegalArgumentException ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro ao salvar", JOptionPane.ERROR_MESSAGE);
                }

            });
            cadastrarInstituicao.add(salvar);
            cadastrarInstituicao.setVisible(true);
            desktopPane.add(cadastrarInstituicao);
        });
        instituicaoAtuacao.add(cadastrarInstituicao);
        cadastros.add(instituicaoAtuacao);

        //professores
        cadastrarProfessor.addActionListener(e->{
            JInternalFrame cadastrarProfessor = new JInternalFrame("Cadastro de professores", false, true, false);
            cadastrarProfessor.setSize(400, 600);
            cadastrarProfessor.setLocation(600,300);
            cadastrarProfessor.setLayout(new FlowLayout());


        });

        professores.add(cadastrarProfessor);
        alunos.add(cadastrarAlunos);

        cadastros.add(professores);
        cadastros.add(alunos);

        atividades.add(cadastrarAtividade);
        menuBar.add(cadastros);
        menuBar.add(atividades);


        frame.setJMenuBar(menuBar);
        frame.add(desktopPane);
        frame.setVisible(true);
    }
}
