package br.com.apson;

import cadastros.AreaAtuacaoMedica;
import cadastros.CadAlunos;
import cadastros.CadInstituicoesSaude;
import cadastros.CadProfessores;
import util.Menu;
import util.Enums;

import java.util.*;
import java.util.function.BiConsumer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;
        int opcaoRelatorio;
        int menuRelatorios = 0;
        AreaAtuacaoMedica areaAtuacaoMedica = new AreaAtuacaoMedica();
        Map<Integer, String> areaAtuacaoMedicaList = new HashMap<>();

        CadProfessores professores = new CadProfessores();
        List<CadProfessores> professoresLista = new ArrayList<>();

        CadAlunos alunos = new CadAlunos();
        List<CadAlunos> alunosLista = new ArrayList<>();

        CadInstituicoesSaude instituicoes = new CadInstituicoesSaude();
        List<CadInstituicoesSaude> instituicoesSaudesLista = new ArrayList<>();



        do {
            Menu.menu();
            System.out.println("Selecione a Opção Desejada: ");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Cadastro de Professores");
                    professores.cadastrarProfessor();
                    break;
                case 2:
                    System.out.println("Cadastro de alunos");
                    alunos.cadastrarAluno();
                    break;
                case 3:
                    System.out.println("instituições de saude");
                    instituicoes.cadastrarInstituicoes();
                    break;
                case 4:
                    areaAtuacaoMedica.criaCadastro(sc, areaAtuacaoMedicaList);
                    areaAtuacaoMedicaList.forEach((num, valor) -> System.out.println(num + " : " + valor));
                    break;
                case 5:
                     System.out.println("Cadastrar APS");
                     break;
                case 6:
                    System.out.println("Ver cadastros");
                    do {
                        Menu.menuRelatorios(); // Exibe o menu de relatórios
                        System.out.print("Escolha uma opção: ");
                        opcaoRelatorio = sc.nextInt();
                        sc.nextLine();}
                    while (opcaoRelatorio != 5);

                case 0:
                    System.out.println("Obrigado por usar o APS-ON");
                    break;
                default:
                    System.out.println("opção inválida, tente novamente!");
                    menu = sc.nextInt();
                    }
            } while (menu != 0);


    }
}


