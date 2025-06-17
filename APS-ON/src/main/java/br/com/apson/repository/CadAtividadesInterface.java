package br.com.apson.repository;

import br.com.apson.entities.CadAtividades;

import java.util.List;

public interface CadAtividadesInterface {
    int criarAtividade(CadAtividades obj);
    void alterarAtividade(CadAtividades obj);
    List<CadAtividades> retornaTodasAsAtividade();
    CadAtividades retornaAtividadeById(int id);
}
