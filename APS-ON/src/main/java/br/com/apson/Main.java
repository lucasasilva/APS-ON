package br.com.apson;

import cadastros.AreaAtuacaoMedica;
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
        AreaAtuacaoMedica areaAtuacaoMedica = new AreaAtuacaoMedica();
        Map<Integer, String> areaAtuacaoMedicaList = new HashMap<>();
        CadInstituicoesSaude cadInstituicoesSaude = new CadInstituicoesSaude();
        List<CadInstituicoesSaude> cadInstituicoesSaudeList = new ArrayList<>();

        CadProfessores professores = new CadProfessores();
        List<CadProfessores> professoresLista = new ArrayList<>();

        do {
            Menu.menu();
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    professores.cadastrarProfessor();
                    break;
                case 2:
                    System.out.println("Cadastro de alunos");
                    break;
                case 3://cadastro de area medica
                    areaAtuacaoMedica.criaCadastro(sc, areaAtuacaoMedicaList);
                    areaAtuacaoMedicaList.forEach((num, valor) -> System.out.println(num + " : " + valor));
                    break;
                case 4:
                    System.out.println("instituições de saude");
                    break;
                case 5:

                     professores.listarProfessores();
                    break;
                case 6:
                    System.out.println("Ver cadastros");
                    break;
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


