package br.com.apson.repository.implementations;

import br.com.apson.entities.CadAtividades;
import br.com.apson.entities.CadAtividadesGrupos;
import br.com.apson.repository.CadAtividadesGruposInterface;
import br.com.apson.util.generics;

import java.util.List;

public class CadAtividadesGruposImplementation implements CadAtividadesGruposInterface {
    @Override
    public void insereGrupo(CadAtividades obj) {
        for (CadAtividadesGrupos i : obj.getQtdGruposAlunos()) {
            CadAtividadesGrupos grupo = new CadAtividadesGrupos(obj, i.getCodGrupo());
            generics.insertBanco(grupo);
        }
    }
    @Override
    public List<CadAtividadesGrupos> retornaTodosGruspos() {
        return generics.selectBanco("from CadAtividadesGrupos", CadAtividadesGrupos.class);
    }
}
