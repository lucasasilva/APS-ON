package br.com.apson.model.repository.implementations;

import br.com.apson.model.entities.CadAtividades;
import br.com.apson.model.entities.CadAtividadesGrupos;
import br.com.apson.model.repository.CadAtividadesGruposInterface;
import br.com.apson.util.generics;

import java.util.List;

public class CadAtividadesGruposImplementation implements CadAtividadesGruposInterface {
    @Override
    public void insereGrupo(CadAtividades obj, int qtdVagas, int qtdVagasSobrando) {
        for (CadAtividadesGrupos i : obj.getQtdGruposAlunos()) {
            CadAtividadesGrupos grupo = new CadAtividadesGrupos(obj, i.getCodGrupo(), qtdVagas, qtdVagasSobrando);
            generics.insertBanco(grupo);
        }
    }
    @Override
    public List<CadAtividadesGrupos> retornaTodosGruspos() {
        return generics.selectBanco("from CadAtividadesGrupos", CadAtividadesGrupos.class);
    }
}
