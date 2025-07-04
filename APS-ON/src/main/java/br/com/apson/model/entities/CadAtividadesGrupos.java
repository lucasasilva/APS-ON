package br.com.apson.model.entities;

import br.com.apson.util.getIDGenerico;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (name = "cad_atividades_grupos")
public class CadAtividadesGrupos implements getIDGenerico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name = "cod_atividade")
    private CadAtividades codAtividade;
    @Column(name = "qtd_vagas")
    private int qtdVagas;
    @Column(name = "qtd_vagas_sobrando")
    private int qtdVagasSobrando;

    @Column (name = "cod_grupo")
    private int codGrupo;

    @OneToMany(mappedBy = "codGrupo",cascade = CascadeType.REMOVE)
    private List<CadAtividadesGruposAlunos> alunosGrupo;

    public long getId() {
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

    public int getCodGrupo() {
        return codGrupo;
    }

    public void setCodGrupo(int codGrupo) {
        this.codGrupo = codGrupo;
    }

    public List<CadAtividadesGruposAlunos> getAlunosGrupo() {
        return alunosGrupo;
    }

    public void setAlunosGrupo(List<CadAtividadesGruposAlunos> alunosGrupo) {
        this.alunosGrupo = alunosGrupo;
    }

    public CadAtividadesGrupos() {
    }

    @Override
    public String getNome() {
        return "";
    }

    public CadAtividadesGrupos(CadAtividades codAtividade, int codGrupo, List<CadAtividadesGruposAlunos> alunosGrupo) {
        this.codAtividade = codAtividade;
        this.codGrupo = codGrupo;
        this.alunosGrupo = alunosGrupo;
    }

    public CadAtividadesGrupos(int id, CadAtividades codAtividade, int codGrupo, List<CadAtividadesGruposAlunos> alunosGrupo) {
        this.id = id;
        this.codAtividade = codAtividade;
        this.codGrupo = codGrupo;
        this.alunosGrupo = alunosGrupo;
    }

    public CadAtividadesGrupos(CadAtividades codAtividade, int codGrupo, int qtdVagas, int qtdVagasSobrando) {
        this.codAtividade = codAtividade;
        this.codGrupo = codGrupo;
        this.qtdVagas = qtdVagas;
        this.qtdVagasSobrando = qtdVagasSobrando;
    }
}
