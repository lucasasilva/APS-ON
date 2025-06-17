package br.com.apson.services;

import br.com.apson.model.entities.CadAlunos;
import br.com.apson.model.repository.implementations.CadAlunosRepImpInterface;

import java.util.List;

public class CadAlunosService {
    CadAlunosRepImpInterface cadAlunosRepImpInterface;

    public CadAlunosService(CadAlunosRepImpInterface cadAlunosRepImpInterface) {
        this.cadAlunosRepImpInterface = cadAlunosRepImpInterface;
    }
    public void criarAluno(CadAlunos obj){
        obj.setTipo("A");

        //valida o resto dos campos not null
        if (obj.getNome() == null || obj.getNome().isBlank()){
            throw new IllegalArgumentException("Nome não pode estar vazio");
        }
        if (obj.getLogin() == null || obj.getLogin().isBlank()){
            throw new IllegalArgumentException("Login não pode estar vazio");
        }
        if (obj.getSenha() == null || obj.getSenha().isBlank()){
            throw new IllegalArgumentException("Senha não pode estar vazio");
        }
        if (obj.getRa() == 0){
            throw new IllegalArgumentException("R.A Não pode estar vazio");
        }
        if(obj.getPeriodo()==0){
            throw new IllegalArgumentException("Periodo não pode estar vazio");
        }
        cadAlunosRepImpInterface.criarAluno(obj);
    }


    public void alterarAluno(CadAlunos obj){
        obj.setTipo("A");

        //valida o resto dos campos not null
        if (obj.getNome() == null || obj.getNome().isBlank()){
            throw new IllegalArgumentException("Nome não pode estar vazio");
        }
        if (obj.getLogin() == null || obj.getLogin().isBlank()){
            throw new IllegalArgumentException("Login não pode estar vazio");
        }
        if (obj.getSenha() == null || obj.getSenha().isBlank()){
            throw new IllegalArgumentException("Senha não pode estar vazio");
        }
        if (obj.getRa() == 0){
            throw new IllegalArgumentException("R.A Não pode estar vazio");
        }
        if(obj.getPeriodo()==0){
            throw new IllegalArgumentException("Periodo não pode estar vazio");
        }
        cadAlunosRepImpInterface.alterarAluno(obj);
    }
    public CadAlunos retornaAlunoPorID(int id){
        return cadAlunosRepImpInterface.retornaAlunoPorID(id);
    }
    public List<CadAlunos> retornaTodosOsAlunos(){
        return cadAlunosRepImpInterface.retornaAlunos();
    }
}

