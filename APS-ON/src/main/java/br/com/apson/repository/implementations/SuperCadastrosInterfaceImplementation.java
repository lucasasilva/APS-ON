package br.com.apson.repository.implementations;

import br.com.apson.entities.SuperCadastros;
import br.com.apson.repository.SuperCadastrosRepInterface;
import br.com.apson.util.generics;

import java.util.List;

public class SuperCadastrosInterfaceImplementation implements SuperCadastrosRepInterface {
    @Override
    public List<SuperCadastros> retornadaTodosUsuarios() {
        return generics.selectBanco("from SuperCadastros", SuperCadastros.class);
    }

}
