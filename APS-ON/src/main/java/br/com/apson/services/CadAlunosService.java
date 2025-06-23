package br.com.apson.services;

import br.com.apson.model.entities.CadAlunos;
import br.com.apson.model.repository.CadAlunosRepInterface;
import br.com.apson.model.repository.implementations.CadAlunosImplementation;

import java.util.List;

public class CadAlunosService {
    CadAlunosRepInterface cadAlunosImplementation;

    public CadAlunosService(CadAlunosRepInterface cadAlunosImplementation) {
        this.cadAlunosImplementation = cadAlunosImplementation;
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
        cadAlunosImplementation.criarAluno(obj);
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
        cadAlunosImplementation.alterarAluno(obj);
    }
    public CadAlunos retornaAlunoPorID(int id){
        return cadAlunosImplementation.retornaAlunoPorID(id);
    }
    public List<CadAlunos> retornaTodosOsAlunos(){
        return cadAlunosImplementation.retornaAlunos();
    }
}

