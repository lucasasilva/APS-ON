package br.com.apson;

import br.com.apson.view.LoginView;

import java.util.logging.Level;
import java.util.logging.Logger;


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

