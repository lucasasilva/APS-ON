package br.com.apson;

import br.com.apson.model.entities.CadAtividades;
import br.com.apson.model.entities.CadAtividadesGrupos;
import br.com.apson.model.entities.CadAtividadesHorariosDisponiveis;
import br.com.apson.model.repository.implementations.CadAtividadesGruposImplementation;
import br.com.apson.model.repository.implementations.CadAtividadesImplementation;
import br.com.apson.services.CadAtividadesServices;
import br.com.apson.view.LoginView;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import static br.com.apson.view.LoginView.*;

public class Main {


    public static void main(String[] args) {
        /*desativa os log irritante do hibernate. Não sei o que acontece em caso de SQLException
        * se virem para descobrir*/
        Logger.getLogger("org.hibernate").setLevel(Level.SEVERE);
        Logger.getLogger("org.hibernate.SQL").setLevel(Level.SEVERE);
        Logger.getLogger("org.hibernate.type.descriptor.sql.BasicBinder").setLevel(Level.SEVERE);

        LoginView loginView = new LoginView();
        loginView.login();
    }

}

