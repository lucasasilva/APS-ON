package br.com.apson.repository;

import br.com.apson.entities.CadAtividades;
import br.com.apson.entities.CadAtividadesPeriodos;

import java.util.List;

public interface CadAtividadesPeriodosInterface {
    void inserePeriodos(CadAtividades obj);
    List<CadAtividadesPeriodos> retornarTodosOsPeriodos();
}
