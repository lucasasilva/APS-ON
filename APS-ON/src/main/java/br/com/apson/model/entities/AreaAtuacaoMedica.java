package br.com.apson.model.entities;

import br.com.apson.util.getIDGenerico;
import jakarta.persistence.*;

@Entity
@Table(name = "cad_area_atuacao_medica")
public class AreaAtuacaoMedica implements getIDGenerico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nome")
    private String nome;

    // Construtor pad
    public AreaAtuacaoMedica() {
    }

    // Construtor nome
    public AreaAtuacaoMedica(String nome) {
        this.nome = nome;
    }

    // Construtor completo
    public AreaAtuacaoMedica(long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    // Getters e Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
