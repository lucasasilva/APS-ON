package br.com.apson.repository;

import br.com.apson.entities.CadAlunos;

import java.util.List;

public interface CadAlunosRepInterface {
    void criarAluno(CadAlunos aluno);
    void alterarAluno(CadAlunos aluno);

    List<CadAlunos> retornaAlunos();
    CadAlunos retornaAlunoPorID(int id);
}
