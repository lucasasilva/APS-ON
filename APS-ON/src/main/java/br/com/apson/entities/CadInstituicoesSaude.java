package br.com.apson.entities;

import br.com.apson.util.Enums;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import jakarta.persistence.*;

@Entity
@Table (name = "cad_instituicoes_saude")
public class CadInstituicoesSaude {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    @Column (name = "nome")
    private String nome;

    public List<CadInstituicoesSaude> getInstituicoesSaudes() {
        return instituicoesSaudes;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(long id) {
        this.id = id;

    }
}
