package cadastros;

import util.Enums;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadProfessores extends SuperCadastros {
    private List<CadProfessores> professores = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private Enums.disponibilidadeDias disponibilidadeDias;
    private int instituicaoAtuacao;

    public Enums.disponibilidadeDias getDisponibilidadeDias() {
        return disponibilidadeDias;
    }

    public void setDisponibilidadeDias(Enums.disponibilidadeDias disponibilidadeDias) {
        this.disponibilidadeDias = disponibilidadeDias;
    }

    public int getInstituicaoAtuacao() {
        return instituicaoAtuacao;
    }

    public void setInstituicaoAtuacao(int instituicaoAtuacao) {
        this.instituicaoAtuacao = instituicaoAtuacao;
    }

    public static void main(String[] args) {
        CadProfessores cadastro = new CadProfessores();
        cadastro.executarMenu();
    }

    public void executarMenu() {
        int opcao;
        do {
            System.out.println("\n--- Cadastro de Professores ---");
            System.out.println("1. Cadastrar Professor");
            System.out.println("2. Listar Professores");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarProfessor();
                    break;
                case 2:
                    listarProfessores();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);
    }

    public void cadastrarProfessor() {
        CadProfessores professor = new CadProfessores();

        System.out.print("Informe o ID do professor: ");
        professor.setId(scanner.nextLong());
        scanner.nextLine();

        System.out.println("Informe o Nome do Professor: ");
        professor.setNome(scanner.nextLine());

        System.out.print("Informe o telefone de contato: ");
        professor.setTelefoneContato(scanner.nextLine());

        System.out.print("Informe o email de contato: ");
        professor.setEmailContato(scanner.nextLine());

        System.out.print("Informe o login: ");
        professor.setLogin(scanner.nextLine());

        System.out.print("Informe a senha: ");
        professor.setSenha(scanner.nextLine());

        System.out.println("Escolha o tipo de cadastro:");
        Enums.tipoCadastro[] tipos = Enums.tipoCadastro.values();
        for (int i = 0; i < tipos.length; i++) {
            System.out.println(i + ". " + tipos[i]);
        }
        System.out.print("Digite o número correspondente: ");
        int escolhaTipo = scanner.nextInt();
        scanner.nextLine();

        if (escolhaTipo >= 0 && escolhaTipo < tipos.length) {
            if (tipos[escolhaTipo] != Enums.tipoCadastro.Professor){
                System.out.println("Apenas Professores podem ser cadastrados!");
                return;
            }
            professor.setTipoCadastro(tipos[escolhaTipo]);
        } else {
            System.out.println("Opção inválida! Definindo como Professor por padrão.");
            professor.setTipoCadastro(Enums.tipoCadastro.Professor);
        }

        setInstituicaoAtuacao(professor);

        System.out.println("Escolha a disponibilidade:");
        Enums.disponibilidadeDias[] dias = Enums.disponibilidadeDias.values();
        for (int i = 0; i < dias.length; i++) {
            System.out.println(i + ". " + dias[i]);
        }
        System.out.print("Digite o número correspondente: ");
        int escolha = scanner.nextInt();
        scanner.nextLine();

        if (escolha >= 0 && escolha < dias.length) {
            professor.setDisponibilidadeDias(dias[escolha]);
        } else {
            System.out.println("Opção inválida! Definindo padrão SEGUNDA.");
            professor.setDisponibilidadeDias(Enums.disponibilidadeDias.segunda);
        }

        professores.add(professor);
        System.out.println("Professor cadastrado com sucesso!");
    }

    public void listarProfessores() {
        if (professores.isEmpty()) {
            System.out.println("Nenhum professor cadastrado.");
        } else {
            System.out.println("\n--- Lista de Professores ---");
            for (CadProfessores p : professores) {
                System.out.println("\nID: " + p.getId() + "\nNome: " + p.getNome() + "\nLogin: " + p.getLogin() + "\nEmail: " + p.getEmailContato() + "\nInstituição: " + p.getInstituicaoAtuacao() + "\nDisponibilidade: " + p.getDisponibilidadeDias());
            }
        }
    }

    private void setInstituicaoAtuacao(CadProfessores professor) {
        System.out.println("\n--- Instituições Disponíveis ---");
        CadInstituicoesSaude[] instituicoesSaudes = new CadInstituicoesSaude[0];
        for (CadInstituicoesSaude instituicao : instituicoesSaudes ) {
            System.out.println("ID: " + instituicao.getId() + " - Nome: " + instituicao.getNome());
        }
        System.out.print("Informe o ID da instituição de atuação: ");
        professor.setInstituicaoAtuacao(scanner.nextInt());
        scanner.nextLine();
    }
}
