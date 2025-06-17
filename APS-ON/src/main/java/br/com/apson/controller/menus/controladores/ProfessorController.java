 package br.com.apson.controller.menus.controladores;

import br.com.apson.model.entities.CadInstituicoesSaude;
import br.com.apson.model.entities.CadProfDiasDisp;
import br.com.apson.model.entities.CadProfessores;
import br.com.apson.model.repository.implementations.CadInstituicoesSaudeRepImpInterface;
import br.com.apson.model.repository.implementations.CadProfessoresRepImplementa;
import br.com.apson.services.CadInstuicoesSaudeService;
import br.com.apson.services.CadProfessoresService;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class ProfessorController {
    /*
    * Loop porque essa opção pode ser uma alteração ou criação
    * */
    public static void criaAlteraProfessor(){
        Scanner sc = new Scanner(System.in);
        int menu;
        do {
            System.out.println("1 - Cadastrar professor  2 - Alterar Cadastro");
            menu = sc.nextInt();
            switch (menu){
                case 1://criar professor
                    manutencaoCadProf(1,null);
                    break;
                case 2://alterar cadastro
                    System.out.println("Qual cadastro será alterado?");
                    Integer codProfessor = sc.nextInt();
                    manutencaoCadProf(2, codProfessor);
                    break;
                case 0:
                    System.out.println("Retornando ao menu!");
                    break;
                default:
                    System.out.println("opção inválida");
            }
        }while(menu !=0);
        sc.close();
    }
    public static void deletaProfessor(){
        Scanner sc = new Scanner(System.in);
        int codProfessor;
        System.out.println("Qual o código do professor a ser excluído");
        codProfessor = sc.nextInt();
        deletarProfessor(codProfessor);
    }
    public static List<CadProfessores> retornaTodosCadastros(){
        CadProfessoresService professores = new CadProfessoresService(new CadProfessoresRepImplementa());
        return professores.retornaTodosProfessores();
    }



        /*
        * manutencao de cadastro porque essa função decide se vai criar um novo ou alterar um cadastro ali em cima
        * desta forma não precisa criar a mesma lógica duas vezes, porque... preguiça*/
    private static void manutencaoCadProf(int opcao, Integer codProfessor){
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
        if (opcao ==1) {
            professor.criarProfessor(novoProfessor);
        } else if (opcao ==2) {
            novoProfessor.setId(codProfessor);
            professor.alterarProfessor(novoProfessor);
        }
    }

    private static void deletarProfessor(int codProfessor){
        //CadProfessoresService professor = new CadProfessoresService(new CadProfessoresRepImplementa());
        System.out.println("nao implementado");
    }



}
