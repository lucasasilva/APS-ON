package br.com.apson;

import br.com.apson.model.entities.CadAtividades;
import br.com.apson.model.entities.CadAtividadesGrupos;
import br.com.apson.model.entities.CadAtividadesHorariosDisponiveis;
import br.com.apson.model.repository.implementations.CadAtividadesGruposImplementation;
import br.com.apson.model.repository.implementations.CadAtividadesImplementation;
import br.com.apson.services.CadAtividadesServices;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {


    public static void main(String[] args) {
        /*desativa os log irritante do hibernate. Não sei o que acontece em caso de SQLException
        * se virem para descobrir*/
        Logger.getLogger("org.hibernate").setLevel(Level.SEVERE);
        Logger.getLogger("org.hibernate.SQL").setLevel(Level.SEVERE);
        Logger.getLogger("org.hibernate.type.descriptor.sql.BasicBinder").setLevel(Level.SEVERE);

        CadAtividadesServices atividadesServices = new CadAtividadesServices(new CadAtividadesImplementation(), new CadAtividadesGruposImplementation());

        List<CadAtividadesHorariosDisponiveis> horariosDisponiveis = new ArrayList<>();
        horariosDisponiveis.add(new CadAtividadesHorariosDisponiveis(null, LocalTime.of(6,0)));

        List<CadAtividadesGrupos> grupos = new ArrayList<>();
        grupos.add(new CadAtividadesGrupos(null, 1));


        CadAtividades atividade = new CadAtividades(1,3,3,4,60,
                                    LocalDate.of(2025, 6,16),
                                    LocalDate.of(2025, 6, 30),
                                    horariosDisponiveis,"1,2,3",grupos);
        atividadesServices.criarAtividade(atividade);
        //login();
    }

}

