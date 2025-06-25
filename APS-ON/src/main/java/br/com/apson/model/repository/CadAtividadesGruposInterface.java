package br.com.apson.model.repository;

import br.com.apson.model.entities.CadAtividades;
import br.com.apson.model.entities.CadAtividadesGrupos;

import java.util.List;

public interface CadAtividadesGruposInterface {
    void insereGrupo(CadAtividades obj, int qtdVagas, int qtdVagasSobrando);
    List<CadAtividadesGrupos> retornaTodosGruspos();
}
