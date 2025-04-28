package br.com.apson.repository;

import br.com.apson.entities.CadAtividades;
import br.com.apson.util.generics;

import java.util.List;

public class CadAtividadesImplementation implements CadAtividadesInterface{
    @Override
    public int criarAtividade(CadAtividades obj) {
        return generics.insertBancoRetornaID(obj);
    }

    @Override
    public void alterarAtividade(CadAtividades obj) {
        generics.updateBanco(obj);
    }

    @Override
    public CadAtividades retornaAtividadeById(int id) {
        return generics.selectBancoByID("from CadAtividades", CadAtividades.class, id);
    }

    @Override
    public List<CadAtividades> retornaTodasAsAtividade() {
        return generics.selectBanco("from CadAtividades", CadAtividades.class);
    }
}
