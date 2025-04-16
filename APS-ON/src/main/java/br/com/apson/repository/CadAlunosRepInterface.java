package br.com.apson.repository;

import br.com.apson.entities.CadAlunos;
import br.com.apson.entities.SuperCadastros;

import java.util.List;

public interface CadAlunosRepInterface {

    void ciarAlunos (CadAlunos alunos);
    void alteraAlunos (CadAlunos alunos);

    List<SuperCadastros> retornarAlunos();
}
