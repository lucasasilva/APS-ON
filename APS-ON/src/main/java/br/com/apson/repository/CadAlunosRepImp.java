package br.com.apson.repository;

import br.com.apson.entities.CadAlunos;
import br.com.apson.entities.SuperCadastros;
import br.com.apson.util.generics;

import java.util.List;

public class CadAlunosRepImp implements CadAlunosRepInterface{
    @Override
    public void ciarAlunos(CadAlunos alunos) {
        generics.insertBanco(alunos);
    }

    @Override
    public void alteraAlunos(CadAlunos alunos) {
        generics.updateBanco(alunos);
    }

    @Override
    public List<SuperCadastros> retornarAlunos() {
        generics.selectBanco()
    }

}
