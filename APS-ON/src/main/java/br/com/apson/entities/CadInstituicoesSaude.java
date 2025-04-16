package br.com.apson.entities;

import br.com.apson.util.Enums;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
@Entity
@Table (name = "cad_instituicoes_saude")
public class CadInstituicoesSaude extends SuperCadastros {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @Column (name = "nome")
    private String nome;

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "CadInstituicoesSaude{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
