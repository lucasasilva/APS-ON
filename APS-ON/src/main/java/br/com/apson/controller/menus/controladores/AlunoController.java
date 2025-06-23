package br.com.apson.controller.menus.controladores;

import br.com.apson.model.entities.CadAlunos;
import br.com.apson.model.repository.implementations.CadAlunosImplementation;
import br.com.apson.services.CadAlunosService;


import java.util.List;
import java.util.Scanner;
@Deprecated
public class AlunoController {
    public static void criaAlteraAluno(){
        Scanner sc = new Scanner(System.in);
        int menu;
        do {
            System.out.println("1 - Cadastrar Aluno  2 - Alterar Cadastro   0 - Sair");
            menu = sc.nextInt();
            switch (menu){
                case 1://criar aluno
                    manutencaoCadAluno(1,null);
                    break;
                case 2://alterar cadastro
                    System.out.println("Qual cadastro será alterado?");
                    Integer codAluno = sc.nextInt();
                    manutencaoCadAluno(2, codAluno);
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




    private static void manutencaoCadAluno(int opcao, Integer codAluno){
        CadAlunosService aluno = new CadAlunosService(new CadAlunosImplementation()) ;
        Scanner sc = new Scanner(System.in);
        CadAlunos novoAluno= new CadAlunos();
        System.out.println("Informe o nome");
        novoAluno.setNome(sc.nextLine());
        System.out.println("Informe o email");
        novoAluno.setEmailContato(sc.nextLine());
        System.out.println("informe o login");
        novoAluno.setLogin(sc.nextLine());
        System.out.println("Informe a senha");
        novoAluno.setSenha(sc.nextLine());
        System.out.println("Informe um telefone para contato");
        novoAluno.setTelefoneContato(sc.nextLine());
        System.out.println("Qual o R.A?");
        novoAluno.setRa(sc.nextInt());
        System.out.println("Qual o período?");
        novoAluno.setPeriodo(sc.nextInt());

        if (opcao ==1) {
            aluno.criarAluno(novoAluno);
        } else if (opcao == 2) {
            novoAluno.setId(codAluno);
            aluno.alterarAluno(novoAluno);
        }
    }

    public static List<CadAlunos> retornaTodosOsAlunos(){
        CadAlunosService alunos = new CadAlunosService(new CadAlunosImplementation());
        return alunos.retornaTodosOsAlunos();
    }
    public static CadAlunos retornaAlunoByID(int id){
        CadAlunosService alunosService = new CadAlunosService(new CadAlunosImplementation());
        return  alunosService.retornaAlunoPorID(id);
    }
    public static void deletarAluno(int codAluno){
        //CadProfessoresService professor = new CadProfessoresService(new CadProfessoresRepImplementa());
        System.out.println("nao implementado");
    }
}
