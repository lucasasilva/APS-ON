package br.com.apson.model.repository;

import br.com.apson.model.entities.CadAtividades;
import br.com.apson.model.entities.CadAtividadesHorariosDisponiveis;

import java.util.List;

public interface CadAtividadesHorariosDisponiveisInterface {
    void insereHorarios (CadAtividades obj);
    List<CadAtividadesHorariosDisponiveis> retornarTodosOsHorarios();
}
