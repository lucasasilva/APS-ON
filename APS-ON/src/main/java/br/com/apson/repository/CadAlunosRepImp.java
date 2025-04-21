package br.com.apson.repository;

import br.com.apson.entities.CadAlunos;
import br.com.apson.util.generics;

import java.util.List;

public class CadAlunosRepImp implements CadAlunosRepInterface{
    @Override
    public void criarAluno(CadAlunos aluno) {
        generics.insertBanco(aluno);
    }

    @Override
    public void alterarAluno(CadAlunos aluno) {
        generics.updateBanco(aluno);
    }

    @Override
    public List<CadAlunos> retornaAlunos() {
        return generics.selectBanco("from CadAlunos", CadAlunos.class);
    }
}
