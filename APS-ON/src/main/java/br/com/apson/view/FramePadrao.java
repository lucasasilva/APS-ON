package br.com.apson.view;

import br.com.apson.controller.Controller;
import br.com.apson.model.entities.CadInstituicoesSaude;
import com.sun.jdi.IntegerValue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FramePadrao {
    Controller controller = new Controller();
     JFrame frame = new JFrame("APS-ON");
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
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

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
            cadastrarProfessor.setLayout(new GridLayout(10,2));
            cadastrarProfessor.add(new JLabel("Nome"));
            JTextField nomeProfessor = new JTextField(10);
            cadastrarProfessor.add(nomeProfessor);
            cadastrarProfessor.add(new JLabel("Email"));
            JTextField email = new JTextField(10);
            cadastrarProfessor.add(email);
            cadastrarProfessor.add(new JLabel("Telefone contato"));
            JTextField telefone = new JTextField(10);
            cadastrarProfessor.add(telefone);
            cadastrarProfessor.add(new JLabel("Login"));
            JTextField login = new JTextField(10);
            cadastrarProfessor.add(login);
            cadastrarProfessor.add(new JLabel("Senha"));
            JPasswordField senha = new JPasswordField(10);
            cadastrarProfessor.add(senha);
            cadastrarProfessor.add(new JLabel("Instituição"));
            JTextField instituicao = new JTextField(1);
            instituicao.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    if(e.getClickCount()==2){
                        Integer idSelecionado = caixaSelecaoInstituicoes();
                        if (idSelecionado !=null){
                            instituicao.setText(String.valueOf(idSelecionado));
                        }
                    }
                }
            });
            cadastrarProfessor.add(instituicao);
            JCheckBox segunda = new JCheckBox("segunda");
            JCheckBox terca = new JCheckBox("terca");
            JCheckBox quarta = new JCheckBox("quarta");
            JCheckBox quinta = new JCheckBox("quinta");
            JCheckBox sexta = new JCheckBox("sexta");
            cadastrarProfessor.add(segunda); cadastrarProfessor.add(terca);cadastrarProfessor.add(quarta);cadastrarProfessor.add(quinta); cadastrarProfessor.add(sexta);
            JButton salvar = new JButton("Salvar");
            salvar.addActionListener(cadProf->{
                try {
                    controller.cadastrarProfessor(String.valueOf(nomeProfessor.getText()),
                            String.valueOf(email.getText()),
                            String.valueOf(telefone.getText()),
                            String.valueOf(login.getText()),
                            String.valueOf(senha.getPassword()),
                            Integer.parseInt(instituicao.getText()),
                            diasDisponiveis(segunda, terca, quarta, quinta, sexta));
                    JOptionPane.showMessageDialog(cadastrarProfessor, "Professor cadastrado");
                    cadastrarProfessor.dispose();
                }catch (IllegalArgumentException ex){
                    JOptionPane.showMessageDialog(cadastrarProfessor, ex.getMessage(), "Erro ao salvar", JOptionPane.ERROR_MESSAGE);
                }
            });
            cadastrarProfessor.add(salvar);
            cadastrarProfessor.setVisible(true);
            desktopPane.add(cadastrarProfessor);
        });
        professores.add(cadastrarProfessor);
        cadastros.add(professores);

        //Alunos
        cadastrarAlunos.addActionListener(e->{
            JInternalFrame cadastrarAluno = new JInternalFrame("Cadastro de Alunos", false, true, false);
            cadastrarAluno.setSize(400, 600);
            cadastrarAluno.setLocation(300,600);
            cadastrarAluno.setLayout(new GridLayout(10,2));

            cadastrarAluno.add(new JLabel("nome"));
            JTextField nome = new JTextField(10);
            cadastrarAluno.add(nome);
            cadastrarAluno.add(new JLabel("Telefone contato"));
            JTextField telefoneContato = new JTextField(10);
            cadastrarAluno.add(telefoneContato);
            cadastrarAluno.add(new JLabel("email"));
            JTextField email = new JTextField(10);
            cadastrarAluno.add(email);
            cadastrarAluno.add(new JLabel("login"));
            JTextField login = new JTextField(10);
            cadastrarAluno.add(login);
            cadastrarAluno.add(new JLabel("Senha"));
            JTextField senha = new JTextField(10);
            cadastrarAluno.add(senha);
            cadastrarAluno.add(new JLabel("RA"));
            JTextField ra = new JTextField(10);
            cadastrarAluno.add(ra);
            cadastrarAluno.add(new JLabel("periodo"));
            Integer[] periodoLista = {1,2,3,4,5,6,7,8};
            JComboBox<Integer> periodo = new JComboBox<>(periodoLista);
            cadastrarAluno.add(periodo);
            JButton salvar = new JButton("Salvar");
            salvar.addActionListener(evt-> {
                try {
                    controller.cadastrarAluno(String.valueOf(nome.getText()),
                            String.valueOf(telefoneContato.getText()),
                            String.valueOf(email.getText()),
                            String.valueOf(login.getText()),
                            String.valueOf(senha.getText()),
                            Integer.parseInt(ra.getText()),
                            Integer.valueOf(String.valueOf(periodo.getSelectedItem())));
                    JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso");
                    cadastrarAluno.dispose();
                } catch (IllegalArgumentException ex){
                    JOptionPane.showMessageDialog(cadastrarAluno, ex.getMessage(), "Erro ao Salvar", JOptionPane.ERROR_MESSAGE);
                }
            });
            cadastrarAluno.add(salvar);
            cadastrarAluno.setVisible(true);
            desktopPane.add(cadastrarAluno);

        });

        alunos.add(cadastrarAlunos);
        cadastros.add(alunos);

        atividades.add(cadastrarAtividade);
        menuBar.add(cadastros);
        menuBar.add(atividades);


        frame.setJMenuBar(menuBar);
        frame.add(desktopPane);
        frame.setVisible(true);
    }
    //transforma as checkbox selecionadas em lista para ser instanciado posteriormente como um array de objetos para gravar o professor;
    //EU NÃO AGUEEEEEEEENTO MAAAAAAAAAAAAAAAAAAAAAAAAIIIIS
    public List<String> diasDisponiveis(JCheckBox segunda, JCheckBox terca, JCheckBox quarta, JCheckBox quinta, JCheckBox sexta){
        List<String> diasSemana= new ArrayList<String>();
        if (segunda.isSelected()){
            diasSemana.add("1");
        }
        if(terca.isSelected()){
            diasSemana.add("2");
        }
        if (quarta.isSelected()){
            diasSemana.add("3");
        }
        if (quinta.isSelected()){
            diasSemana.add("4");
        }
        if (sexta.isSelected()){
            diasSemana.add("5");
        }
        return diasSemana;
    }

    //caixa de seleção de instituições
    Integer caixaSelecaoInstituicoes (){
        JDialog caixaSeleca = new JDialog((Frame) null, "Instiuições Cadastradas", true);
        caixaSeleca.setLocation(600,300);
        caixaSeleca.setSize(300, 400);
        List<CadInstituicoesSaude> instituicoesSaudes = controller.retornaTodasInstituicoes();

        String[] coluna = {"ID", "Nome"};
        String [][] dados = new String[instituicoesSaudes.size()][2];

        for(int i=0; i<instituicoesSaudes.size(); i++){
            dados[i][0] = String.valueOf(instituicoesSaudes.get(i).getId());
            dados[i][1] = String.valueOf(instituicoesSaudes.get(i).getNome());
        }
        JTable tabela = new JTable(dados, coluna);
        JScrollPane painel = new JScrollPane(tabela);
        caixaSeleca.add(painel);
        Integer[] idInstClicada = {null};
        tabela.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 1){
                    int linha = tabela.getSelectedRow();
                    idInstClicada[0] = Integer.parseInt((String)tabela.getValueAt(linha, 0));
                    caixaSeleca.dispose();
                }
            }
        });
        caixaSeleca.setVisible(true);
        return idInstClicada[0];
    }

    //caixa de seleção de áreas de atuação;
}
