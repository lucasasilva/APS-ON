package br.com.apson.view;

import br.com.apson.controller.Controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.function.Consumer;

import static br.com.apson.view.CaixaSelecaoInternas.caixaSelecao;

//Por que colocar aqui? Porque só o ADM pode excluir cadastro;
public class AdmView {
    Controller controller = new Controller();

    //Meu orgulho isso aqui;
    public void admView(){
        FramePadrao framePadrao = new FramePadrao();

        // Criação dos menus com ações genéricas
        adicionarMenuExclusao(framePadrao, framePadrao.areaAtuacao, "Excluir Área", 2,
                id -> controller.excluirAreaA(id));

        adicionarMenuExclusao(framePadrao, framePadrao.instituicaoAtuacao, "Excluir Instituição", 1,
                id -> controller.excluirInstituicao(id));

        adicionarMenuExclusao(framePadrao, framePadrao.professores, "Excluir Professor", 3,
                id -> controller.deletarProfessorAluno(id));

        adicionarMenuExclusao(framePadrao, framePadrao.alunos, "Excluir Aluno", 4,
                id -> controller.deletarProfessorAluno(id));
    }

    /**
     *  framePadrao Referência ao frame principal
     *  menu O JMenu ao qual adicionar o item(area atuacao, cadastro de alino, de professor ou de instituição)
     *  Título do item e da janela
     *  tipo: O tipo de item que a função "caixaSelecao" vai buscar (aluno, professor, instituiao, area de atuação)
     *  acaoExcluir: qual das funções do controller será chamada
     */
    private void adicionarMenuExclusao(FramePadrao framePadrao, JMenu menu, String titulo, int tipo, Consumer<Long> acaoExcluir) {
        JMenuItem item = new JMenuItem(titulo);

        item.addActionListener(e -> {
            JInternalFrame excluir = new JInternalFrame(titulo, false, true, false);
            excluir.setSize(400, 100);
            excluir.setLocation(600, 400);
            excluir.setLayout(new GridLayout(1, 3));

            excluir.add(new JLabel("Código"));
            JTextField campo = new JTextField(5);
            campo.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    if (e.getClickCount() == 2) {
                        Integer idSeleciona = caixaSelecao(tipo);
                        if (idSeleciona != null) {
                            campo.setText(String.valueOf(idSeleciona));
                        }
                    }
                }
            });
            excluir.add(campo);

            JButton excluirBtn = new JButton("Excluir");
            excluirBtn.addActionListener(evt -> {
                try {
                    long id = Long.parseLong(campo.getText());
                    acaoExcluir.accept(id);
                    JOptionPane.showMessageDialog(null, "Registro excluído com sucesso");
                    excluir.dispose();
                } catch (RuntimeException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao excluir registro: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                }
            });
            excluir.add(excluirBtn);
            excluir.setVisible(true);
            framePadrao.desktopPane.add(excluir);
        });

        menu.add(item);
    }
}
