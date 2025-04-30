package br.com.apson.controller;

import br.com.apson.entities.CadInstituicoesSaude;
import br.com.apson.entities.CadProfDiasDisp;
import br.com.apson.entities.CadProfessores;
import br.com.apson.repository.CadInstituicoesSaudeRepImpInterface;
import br.com.apson.repository.CadProfessoresRepImplementa;
import br.com.apson.repository.CadProfessoresRepInterface;
import br.com.apson.services.CadInstuicoesSaudeService;
import br.com.apson.services.CadProfessoresService;
import br.com.apson.util.Menu;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class ProfessorController {
    public static void professores(){
        Scanner sc = new Scanner(System.in);
        int menu;
        do {
            Menu.menuProfessores();
            menu = sc.nextInt();
            switch (menu){
                case 1:
                    criarProfessor();
                    break;
                case 2:
            }
        }while(menu !=0);
    }


    public static void criarProfessor(){
        CadProfessoresService professor = new CadProfessoresService(new CadProfessoresRepImplementa()) ;
        Scanner sc = new Scanner(System.in);
        CadProfessores novoProfessor= new CadProfessores();
        System.out.println("Informe o nome");
        novoProfessor.setNome(sc.nextLine());
        System.out.println("Informe o email");
        novoProfessor.setEmailContato(sc.nextLine());
        System.out.println("informe o login");
        novoProfessor.setLogin(sc.nextLine());
        System.out.println("Informe a senha");
        novoProfessor.setSenha(sc.nextLine());
        System.out.println("Informe um telefone para contato");
        novoProfessor.setTelefoneContato(sc.nextLine());

        System.out.println("Informa o código da instituição");
        CadInstuicoesSaudeService instuicoesSaudeService = new CadInstuicoesSaudeService(new CadInstituicoesSaudeRepImpInterface());
        List<CadInstituicoesSaude>  todasInstituicoes = instuicoesSaudeService.retornaTodasInstituicoes();
        for(CadInstituicoesSaude i: todasInstituicoes){
            System.out.println(i.getId()+" - "+i.getNome());
        }
        novoProfessor.setInstitucaoAtuacao(sc.nextInt());
        sc.nextLine();
        List<CadProfDiasDisp> diasDisponiveis = new ArrayList<>();
        /*simples de entender mas chato de visualizar.
        * 1. No cadastro do professor (por @Joincolumn) passamos uma LISTA de dias do tipo CadProfDiasDisp
        * 2. Temos que pegar essa lista de alguma forma, então, primeiro, passamos como uma string de numeros
        * aqui é só teste, então não tem tratativa mesmo
        * 3. Uma vez que temos a string, a transformamos em um vetor (strArray)
        * 4. Por último, percorremos o array, convertendo os valores para integer e adicionando os
        * objetos na lista que será usada para criar o novo professor*/
        System.out.println("Informe os dias dias disponiveis da semanano formato (0,1,3)");
        String dias = sc.nextLine();
        String[] strArray = dias.split(",");
        for (String i : strArray){
            int dia = Integer.parseInt(i);
            diasDisponiveis.add(new CadProfDiasDisp(dia));
        }
        novoProfessor.setDiasDisponiveis(diasDisponiveis);
        professor.criarProfessor(novoProfessor);
    }

}
