package br.com.apson.model.entities;

import br.com.apson.util.getIDGenerico;
import jakarta.persistence.*;

@Entity
@Table(name = "cad_instituicoes_saude")
public class CadInstituicoesSaude implements getIDGenerico {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nome")
    private String nome;

    public long getId() {
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

    public CadInstituicoesSaude(String nome) {
        this.nome = nome;
    }

    public CadInstituicoesSaude(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    public CadInstituicoesSaude(){}
}
