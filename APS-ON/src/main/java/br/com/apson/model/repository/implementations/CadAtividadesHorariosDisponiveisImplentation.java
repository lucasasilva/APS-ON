package br.com.apson.model.repository.implementations;

import br.com.apson.model.entities.CadAtividades;
import br.com.apson.model.entities.CadAtividadesHorariosDisponiveis;
import br.com.apson.model.repository.CadAtividadesHorariosDisponiveisInterface;
import br.com.apson.util.generics;

import java.util.List;

public class CadAtividadesHorariosDisponiveisImplentation implements CadAtividadesHorariosDisponiveisInterface {
    @Override
    public void insereHorarios(CadAtividades obj) {
        /*
        * Percorre a lista de horários disponíveis no objeto recebido pelo frontl
        * Para cada horário da lista, cria um objeto do tipo da classe e insere no banco
        * */
        for (CadAtividadesHorariosDisponiveis i : obj.getHorariosDisponiveis()){
            CadAtividadesHorariosDisponiveis horarios = new CadAtividadesHorariosDisponiveis(obj, i.getHorarioDisponivel());
            generics.insertBanco(horarios);
        }
    }

    @Override
    public List<CadAtividadesHorariosDisponiveis> retornarTodosOsHorarios() {
        return generics.selectBanco("CadAtividadesHorariosDisponiveis", CadAtividadesHorariosDisponiveis.class);
    }
}
