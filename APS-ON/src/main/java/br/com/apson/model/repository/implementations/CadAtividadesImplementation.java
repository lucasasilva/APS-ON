package br.com.apson.model.repository.implementations;

import br.com.apson.model.entities.CadAtividades;
import br.com.apson.model.repository.CadAtividadesInterface;
import br.com.apson.util.generics;

import java.util.List;

public class CadAtividadesImplementation implements CadAtividadesInterface {
    @Override
    public void criarAtividade(CadAtividades obj) {
        generics.insertBancoRetornaID(obj);
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
