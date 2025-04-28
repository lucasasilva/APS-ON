package br.com.apson.entities;

import jakarta.persistence.*;

@Entity
@Table (name = "cad_ativ_grupos_alunos")
public class CadAtividadesGruposAlunos {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn (name = "cod_grupo")
    private CadAtividadesGrupos codGrupo;
    @Column
    private int codAtividade;
    @Column (name = "codigo_aluno")
    private int idAluno;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CadAtividadesGrupos getCodGrupo() {
        return codGrupo;
    }

    public void setCodGrupo(CadAtividadesGrupos codGrupo) {
        this.codGrupo = codGrupo;
    }

    public int getCodAtividade() {
        return codAtividade;
    }

    public void setCodAtividade(int codAtividade) {
        this.codAtividade = codAtividade;
    }

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public CadAtividadesGruposAlunos() {
    }

    public CadAtividadesGruposAlunos(int id, CadAtividadesGrupos codGrupo, int codAtividade, int idAluno) {
        this.id = id;
        this.codGrupo = codGrupo;
        this.codAtividade = codAtividade;
        this.idAluno = idAluno;
    }

    public CadAtividadesGruposAlunos(CadAtividadesGrupos codGrupo, int codAtividade, int idAluno) {
        this.codGrupo = codGrupo;
        this.codAtividade = codAtividade;
        this.idAluno = idAluno;
    }
}
