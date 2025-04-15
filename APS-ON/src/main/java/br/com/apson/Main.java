package br.com.apson;

import br.com.apson.entities.SuperCadastros;

import br.com.apson.util.generics;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Aqui passamos a query que queremos usar como parâmetro do select genérico.
        * Importante: Se queremos somente alguns campos (e não todos os campos da classe/objeto) temos que passar:
        * String query = "select new br.com.apson.entities.classe (campo1, campo2, campo3) from nomeDaClasse"
        * e ter um construtor na classe com os campos estamos retornando na ordem, senão dá pau
        * Isso também mantém legibilidade, visto que os babuínos que lerão isso sempre saberão de onde
        * estão vindo os dados
        *
        * ABAIXO DOIS EXEMPLOS DE COMO FAZÊ-LO*/
        String query = "from SuperCadastros";

        List<SuperCadastros> pessoas  = generics.selectBanco(query, SuperCadastros.class);

        for (SuperCadastros pessoa:pessoas){
            System.out.println(pessoa.toString());
        }
        sc.close();
    }
}

