package br.com.apson.repository;

import br.com.apson.entities.CadAtividades;
import br.com.apson.entities.CadAtividadesPeriodos;
import br.com.apson.util.generics;

import java.util.List;

public class CadAtividadesPeriodosImplementation implements CadAtividadesPeriodosInterface{
    @Override
    public void inserePeriodos(CadAtividades obj) {
        /*Recebe um objeto CadAtividades que foi inserido, percorre a lista de períodos que foi marcada pelo Userrr
        e, para cada período, insere um novo objeto do tipo da classe do período,  no banco
        * */
        for (CadAtividadesPeriodos i : obj.getPeriodosPermitidos()){
            CadAtividadesPeriodos periodos = new CadAtividadesPeriodos(obj, i.getPeriodosPermitidos());
            generics.insertBanco(periodos);
        }
    }

    @Override
    public List<CadAtividadesPeriodos> retornarTodosOsPeriodos() {
        return generics.selectBanco("from CadAtividadesPeriodos", CadAtividadesPeriodos.class);
    }
}
