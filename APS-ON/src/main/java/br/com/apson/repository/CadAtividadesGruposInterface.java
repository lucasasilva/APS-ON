package br.com.apson.repository;

import br.com.apson.entities.CadAtividades;
import br.com.apson.entities.CadAtividadesGrupos;

import java.util.List;

public interface CadAtividadesGruposInterface {
    void insereGrupo(CadAtividades obj);
    List<CadAtividadesGrupos> retornaTodosGruspos();
}
