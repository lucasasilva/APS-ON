package br.com.apson.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (name = "cad_atividades_grupos")
public class CadAtividadesGrupos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "cod_atividade")
    private CadAtividades codAtividade;
    @Column (name = "cod_grupo")
    private int cod_grupo;

    @OneToMany(mappedBy = "codGrupo",cascade = CascadeType.REMOVE)
    private List<CadAtividadesGruposAlunos> alunosGrupo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CadAtividades getCodAtividade() {
        return codAtividade;
    }

    public void setCodAtividade(CadAtividades codAtividade) {
        this.codAtividade = codAtividade;
    }

    public int getCod_grupo() {
        return cod_grupo;
    }

    public void setCod_grupo(int cod_grupo) {
        this.cod_grupo = cod_grupo;
    }

    public List<CadAtividadesGruposAlunos> getAlunosGrupo() {
        return alunosGrupo;
    }

    public void setAlunosGrupo(List<CadAtividadesGruposAlunos> alunosGrupo) {
        this.alunosGrupo = alunosGrupo;
    }

    public CadAtividadesGrupos() {
    }

    public CadAtividadesGrupos(CadAtividades codAtividade, int cod_grupo, List<CadAtividadesGruposAlunos> alunosGrupo) {
        this.codAtividade = codAtividade;
        this.cod_grupo = cod_grupo;
        this.alunosGrupo = alunosGrupo;
    }

    public CadAtividadesGrupos(int id, CadAtividades codAtividade, int cod_grupo, List<CadAtividadesGruposAlunos> alunosGrupo) {
        this.id = id;
        this.codAtividade = codAtividade;
        this.cod_grupo = cod_grupo;
        this.alunosGrupo = alunosGrupo;
    }
}
