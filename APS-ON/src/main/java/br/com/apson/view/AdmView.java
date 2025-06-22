package br.com.apson.view;

import javax.swing.*;

public class AdmView {
    public void admView(){
        FramePadrao framePadrao = new FramePadrao();
        JMenuItem excluirArea = new JMenuItem("Excluir Cadastro");
        JMenuItem excluirInstituicao = new JMenuItem("Excluir Cadastro");
        JMenuItem excluirProfessor = new JMenuItem("Excluir Cadastro");
        JMenuItem excluirAluno = new JMenuItem("Excluir Cadastro");
        JMenuItem excluirAtividade  = new JMenuItem("Excluir Cadastro");


        framePadrao.areaAtuacao.add(excluirArea);
        framePadrao.instituicaoAtuacao.add(excluirInstituicao);
        framePadrao.professores.add(excluirProfessor);
        framePadrao.alunos.add(excluirAluno);
        framePadrao.atividades.add(excluirAtividade);
    }
}
