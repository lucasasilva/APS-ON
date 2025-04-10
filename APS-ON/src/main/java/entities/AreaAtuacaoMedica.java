package entities;

import java.util.Map;
import java.util.Scanner;

public class AreaAtuacaoMedica {
    private int id;
    private String nome;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void criaCadastro (Scanner sc, Map<Integer, String> lista){
        char vParada;
        do {
            AreaAtuacaoMedica object = new AreaAtuacaoMedica();
            System.out.println("Qual a id da area? ");
            object.setId(sc.nextInt());
            sc.nextLine();
            System.out.println("Qual o nome da area");
            object.setNome(sc.nextLine());
            lista.put(object.getId(), object.getNome());
            System.out.println("Deseja continuar cadastrando areas?");
            vParada = sc.next().charAt(0);
        }while (Character.toUpperCase(vParada)=='S');

    }
    //TOME-LHE POLIMORFISMO LEK, DRUIDA ATÉ NO CÓDIGO
    @Override
    public String toString() {
        return this.getId() + " " + this.getNome();
    }
}
