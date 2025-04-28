package br.com.apson.repository;

import br.com.apson.entities.CadAtividades;
import br.com.apson.entities.CadAtividadesHorariosDisponiveis;

import java.util.List;

public interface CadAtividadesHorariosDisponiveisInterface {
    void insereHorarios (CadAtividades obj);
    List<CadAtividadesHorariosDisponiveis> retornarTodosOsHorarios();
}
