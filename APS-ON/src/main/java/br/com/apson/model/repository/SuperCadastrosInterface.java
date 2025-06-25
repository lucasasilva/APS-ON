package br.com.apson.model.repository;

import br.com.apson.model.entities.SuperCadastros;

import java.util.List;

public interface SuperCadastrosInterface {
    List<SuperCadastros> retornaTodasPessoas();
    void excluirPessoa(Long id);
}
