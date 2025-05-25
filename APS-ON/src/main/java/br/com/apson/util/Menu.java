package br.com.apson.util;

public class Menu {
    public static void menu (){
        System.out.println("Escolha uma opção");
        System.out.println("1 - Menu professores         2 - Menu alunos");
        System.out.println("3 - Menu Instituições        4 - Menu Áreas médicas");
        System.out.println("5 - Menu Atividades           ");
        System.out.println("0 - Sair");

    }

    public static void menuProfessores(){
        System.out.println("1 - Cadastrar/alterar Professor");
        System.out.println("2 - Ver todos os cadastros");
    }

    public static void menuInstuicoes(){
        System.out.println("1 - Cadastrar/Alterar Instituicao");
        System.out.println("2 - Ver todos os cadastros");
    }
    public static void menuAreasAtuacao(){
        System.out.println("1 - Cadastrar/alterar Area de Atuação");
        System.out.println("2 - Ver todos os cadastros");
    }
    public static void menuAtividades(){
        System.out.println("1 - Cadastrar/alterar Atividade");
        System.out.println("2 - Ver todos os cadastros");
    }
    public static void menuAlunos(){
        System.out.println("1 - Cadastrar/alterar Aluno");
        System.out.println("2 - Ver todos os cadastros");
    }
}
