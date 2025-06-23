package br.com.apson.model.repository.implementations;

import br.com.apson.model.entities.CadAlunos;
import br.com.apson.model.repository.CadAlunosRepInterface;
import br.com.apson.util.generics;

import java.util.List;

public class CadAlunosImplementation implements CadAlunosRepInterface {
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

    @Override
    public CadAlunos retornaAlunoPorID(int id) {
        return generics.selectBancoByID("from CadAlunos", CadAlunos.class, id);
    }
}
