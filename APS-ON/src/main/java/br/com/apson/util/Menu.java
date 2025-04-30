package br.com.apson.util;

public class Menu {
    public static void menu (){
        System.out.println("Escolha uma opção");
        System.out.println("1 - Menu professores         2 - Menu alunos****não implementado***");
        System.out.println("3 - Menu Instituições        4 - Menu Áreas médicas");
        System.out.println("5 - Menu Atividades           ");
        System.out.println("0 - Sair");

    }
    public static void menuRelatorios(){
        System.out.println("1 - Ver cadastro de professores     2 - Ver cadastro de alunos");
        System.out.println("3 - Ver cadastro de instituições    4 - Ver Cadastro de Áreas");
        System.out.println("5 - voltar");
    }
    public static void menuProfessores(){
        System.out.println("1 - Cadastrar Professor");
        System.out.println("2 - Alterar cadastro");
        System.out.println("3 - Deletar cadastro ***não implementado***");
        System.out.println("4 - Ver todos os cadastros");
        System.out.println("5 - Ver cadastro específico");
    }

    public static void menuInstuicoes(){
        System.out.println("1 - Cadastrar Instituicao");
        System.out.println("2 - Alterar cadastro");
        System.out.println("3 - Deletar cadastro ***não implementado***");
        System.out.println("4 - Ver todos os cadastros");
        System.out.println("5 - Ver cadastro específico");
    }
    public static void menuAreasAtuacao(){
        System.out.println("1 - Cadastrar Area de Atuação");
        System.out.println("2 - Alterar cadastro");
        System.out.println("3 - Deletar cadastro ***não implementado***");
        System.out.println("4 - Ver todos os cadastros");
        System.out.println("5 - Ver cadastro específico");
    }
    public static void menuAtividades(){
        System.out.println("1 - Cadastrar Atividade");
        System.out.println("2 - Alterar cadastro");
        System.out.println("3 - Deletar cadastro ***não implementado***");
        System.out.println("4 - Ver todos os cadastros");
        System.out.println("5 - Ver cadastro específico");
    }
}
