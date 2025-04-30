package br.com.apson.repository;

import br.com.apson.entities.SuperCadastros;
import br.com.apson.util.generics;

import java.util.List;

public class SuperCadastrosImplementation implements SuperCadastrosInterface{
    @Override
    public List<SuperCadastros> retornaTodasPessoas() {
        return generics.selectBanco("from SuperCadastros", SuperCadastros.class);
    }
}
