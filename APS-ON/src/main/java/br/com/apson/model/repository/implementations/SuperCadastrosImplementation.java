package br.com.apson.model.repository.implementations;

import br.com.apson.model.entities.SuperCadastros;
import br.com.apson.model.repository.SuperCadastrosInterface;
import br.com.apson.util.generics;

import java.util.List;

public class SuperCadastrosImplementation implements SuperCadastrosInterface {
    @Override
    public List<SuperCadastros> retornaTodasPessoas() {
        return generics.selectBanco("from SuperCadastros", SuperCadastros.class);
    }
}
