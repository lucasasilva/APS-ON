package br.com.apson.controller.menus;

import br.com.apson.controller.menus.controladores.AlunoController;
import br.com.apson.controller.menus.controladores.ProfessorController;
import br.com.apson.entities.CadAlunos;
import br.com.apson.entities.CadProfessores;
import br.com.apson.util.Menu;

import java.util.List;
import java.util.Scanner;

import static br.com.apson.controller.menus.controladores.ProfessorController.*;


public class MenuAdm {
    public static void menu(){
    Scanner sc = new Scanner(System.in);
        int menu;
        int menuInterno;
        do {
            Menu.menu();
            menu = sc.nextInt();
            switch (menu) {
                case 1://professores
                    Menu.menuProfessores();
                    System.out.println("3 - Exlcuir Cadastro");
                    menuInterno = sc.nextInt();
                    if (menuInterno == 1){
                        criaAlteraProfessor();
                    } else if (menuInterno == 2) {
                        List< CadProfessores> professores = retornaTodosCadastros();
                        for(CadProfessores i : professores){
                            System.out.println(i);
                        }
                    } else if (menuInterno == 3) {
                        ProfessorController.deletaProfessor();
                    }
                    break;
                case 2://alunos
                    Menu.menuAlunos();
                    System.out.println("3 - Excluir Cadastro");
                    menuInterno = sc.nextInt();
                    if (menuInterno == 1 ){
                        AlunoController.criaAlteraAluno();
                    } else if (menuInterno == 2) {
                        List<CadAlunos> alunos = AlunoController.retornaTodosOsAlunos();
                        for(CadAlunos i : alunos){
                            System.out.println(i);
                        }
                    } else if (menuInterno == 3) {
                        System.out.println("Qual aluno será deletado?");
                        int codAluno = sc.nextInt();
                        AlunoController.deletarAluno(codAluno);
                    }
                    break;
                case 3: //instituições
                    break;
                case 4://Areas de atuação
                    break;
                case 5: //atividades
                    break;
                case 0:
                    System.out.println("Obrigado por usar");
                default:
                    System.out.println("opção inválida");
                    sc.nextInt();
            }
        } while (menu != 0);
    }
}
