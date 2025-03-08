package cadastros;

import util.Enums;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadInstituicoesSaude extends SuperCadastros {

    private List<CadInstituicoesSaude> instituicoesSaudes = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public List<CadInstituicoesSaude> getInstituicoesSaudes() {
        return instituicoesSaudes;
    }

    public void setInstituicoesSaudes(List<CadInstituicoesSaude> instituicoesSaudes) {
        this.instituicoesSaudes = instituicoesSaudes;
    }

    public void executarMenu() {
        int opcao;
        do {
            System.out.println("\n--- Cadastro de Instituições de Saúde ---");
            System.out.println("1. Cadastrar Instituições");
            System.out.println("2. Listar Instituições");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarInstituicoes();
                    break;
                case 2:
                    listarInstituicoes();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);
    }

    public void cadastrarInstituicoes() {
        CadInstituicoesSaude instituicoesSaude = new CadInstituicoesSaude();

        System.out.print("Informe o ID da Instituicao: ");
        instituicoesSaude.setId(scanner.nextLong());
        scanner.nextLine();

        System.out.println("Informe o Nome da Instituição de Saúde");
        instituicoesSaude.setNome(scanner.nextLine());
        scanner.nextLine();

        System.out.print("Informe o telefone de contato do responsável da instituição: ");
        instituicoesSaude.setTelefoneContato(scanner.nextLine());

        System.out.print("Informe o email de contato do responsável: ");
        instituicoesSaude.setEmailContato(scanner.nextLine());


        System.out.println("Escolha o tipo de cadastro:");
        Enums.tipoCadastro[] tipos = Enums.tipoCadastro.values();
        for (int i = 0; i < tipos.length; i++) {
            System.out.println(i + ". " + tipos[i]);
        }
        System.out.print("Digite o número correspondente: ");
        int escolhaTipo = scanner.nextInt();
        scanner.nextLine();

        if (escolhaTipo >= 0 && escolhaTipo < tipos.length) {
            if (tipos[escolhaTipo] == Enums.tipoCadastro.Instituicao) {
                System.out.println("Permitido Somente Cadastro de Instituicao");
                return;
            }
            instituicoesSaude.setTipoCadastro(tipos[escolhaTipo]);
        } else {
            System.out.println("Opção inválida! Definindo como Instituição por padrão.");
            instituicoesSaude.setTipoCadastro(Enums.tipoCadastro.Instituicao);
        }

        instituicoesSaudes.add(instituicoesSaude);
        System.out.println("Instituição cadastrada com sucesso!");
    }

    public void listarInstituicoes() {
        if (instituicoesSaudes.isEmpty()) {
            System.out.println("Nenhuma Instituição cadastrada.");
        } else {
            System.out.println("\n--- Lista de Instituição ---");
            for (CadInstituicoesSaude p : instituicoesSaudes) {
                System.out.println(" ID: " + p.getId() + "\n Nome:" + p.getNome() + "\n Email: " + p.getEmailContato() + "\nTelefone de contato" +p.getTelefoneContato());
            }
        }
    }

    public static void main(String[] args) {
        CadInstituicoesSaude cadastro = new CadInstituicoesSaude();
        cadastro.executarMenu();
    }
}
