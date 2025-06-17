package br.com.apson.repository.implementations;

import br.com.apson.entities.CadAlunos;
import br.com.apson.repository.CadAlunosRepInterface;
import br.com.apson.util.generics;

import java.util.List;

public class CadAlunosRepImpInterface implements CadAlunosRepInterface {
    @Override
    public void criarAluno(CadAlunos aluno) {
        generics.insertBanco(aluno);
    }

    @Override
    public void alterarAluno(CadAlunos aluno) {
        generics.updateBanco(aluno);
    }

    @Override
    public CadAlunos retornaAlunoPorID(int id) {
        return generics.selectBancoByID("from CadAlunos", CadAlunos.class, id);
    }

    @Override
    public List<CadAlunos> retornaAlunos() {
        return generics.selectBanco("from CadAlunos", CadAlunos.class);
    }
}
