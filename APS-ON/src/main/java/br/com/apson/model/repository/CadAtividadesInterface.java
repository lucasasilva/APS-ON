package br.com.apson.model.repository;

import br.com.apson.model.entities.CadAtividades;

import java.util.List;

public interface CadAtividadesInterface {
    void criarAtividade(CadAtividades obj);
    void alterarAtividade(CadAtividades obj);
    List<CadAtividades> retornaTodasAsAtividade();
    CadAtividades retornaAtividadeById(int id);
}
