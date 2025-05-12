package br.com.apson.services;

import br.com.apson.repository.SuperCadastrosRepInterface;
import br.com.apson.repository.implementations.SuperCadastrosInterfaceImplementation;

import java.util.List;

public class SuperCadastrosService {
    public SuperCadastrosRepInterface pessoas;

    public SuperCadastrosService(SuperCadastrosRepInterface pessoas) {
        this.pessoas = pessoas;
    }

    public List retornaTodosUsuarios(){
        return pessoas.retornadaTodosUsuarios();
    }
}
