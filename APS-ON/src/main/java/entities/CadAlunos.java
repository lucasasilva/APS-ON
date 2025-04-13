package entities;

import util.Enums;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadAlunos extends SuperCadastros {
    private List<CadAlunos> alunos = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private Enums.periodos periodo;

    public Enums.periodos getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Enums.periodos periodo) {
        this.periodo = periodo;
    }

    public List<CadAlunos> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<CadAlunos> alunos) {
        this.alunos = alunos;
    }

    public void executarMenu() {
        int opcao;
        do {
            System.out.println("\n--- Cadastro de Aluno ---");
            System.out.println("1. Cadastrar Aluno");
            System.out.println("2. Listar Alunos");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarAluno();
                    break;
                case 2:
                    listarAluno();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);
    }

    public void cadastrarAluno() {
        CadAlunos aluno = new CadAlunos();

        System.out.print("Informe o ID do Aluno: ");
        aluno.setId(scanner.nextLong());
        scanner.nextLine();

        System.out.print("Informe seu nome: ");
        aluno.setNome(scanner.nextLine());

        System.out.println("Qual seu período");
        Enums.periodos[] periodos = Enums.periodos.values();
        for (int i = 0; i < periodos.length; i++) {
            System.out.println(i + " - " + periodos[i]);
        }
        System.out.print("Escolha o número correspondente ao período: ");



        System.out.print("Informe o telefone de contato: ");
        aluno.setTelefoneContato(scanner.nextLine());

        System.out.print("Informe o email de contato: ");
        aluno.setEmailContato(scanner.nextLine());

        System.out.print("Informe o login: ");
        aluno.setLogin(scanner.nextLine());

        System.out.print("Informe a senha: ");
        aluno.setSenha(scanner.nextLine());

        alunos.add(aluno);
        System.out.println("Aluno cadastrado com sucesso!");
    }

    public void listarAluno() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum Aluno cadastrado.");
        } else {
            System.out.println("\n--- Lista de alunos ---");
            for (CadAlunos p : alunos) {
                System.out.println(" ID: " + p.getId() + "\n Nome: " +p.getNome() +  "\n Periodo:" + p.getPeriodo() + "\n Login:" + p.getLogin() + "\n Email: " + p.getEmailContato());
            }
        }
    }

    public static void main(String[] args) {
        CadAlunos cadastro = new CadAlunos();
        cadastro.executarMenu();
    }
}
