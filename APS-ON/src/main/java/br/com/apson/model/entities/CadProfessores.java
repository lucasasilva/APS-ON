package br.com.apson.model.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (name = "cad_professores")
public class CadProfessores  extends SuperCadastros {
    @Column (name = "instituicao_trabalho")
    private int institucaoAtuacao;

    @OneToMany(mappedBy = "idProfessor", cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
    private List<CadProfDiasDisp> diasDisponiveis;

    public List<CadProfDiasDisp> getDiasDisponiveis() {
        return diasDisponiveis;
    }

    public void setDiasDisponiveis(List<CadProfDiasDisp> diasDisponiveis) {
        this.diasDisponiveis = diasDisponiveis;
    }

    public int getInstitucaoAtuacao() {
        return institucaoAtuacao;
    }

    public void setInstitucaoAtuacao(int institucaoAtuacao) {
        this.institucaoAtuacao = institucaoAtuacao;
    }

    public CadProfessores(int institucaoAtuacao) {
        this.institucaoAtuacao = institucaoAtuacao;
    }


    public CadProfessores(String nome,  String telefone,String email, String login, String senha,  int institucaoAtuacao, List<CadProfDiasDisp> cadProfDiasDisps){
        super(nome, email,telefone, login, senha );
        this.institucaoAtuacao = institucaoAtuacao;
        this.diasDisponiveis = cadProfDiasDisps;
    }

    public CadProfessores(){
        
    }

    @Override
    public String toString() {
        return super.toString() + "{" +
                "institucaoAtuacao=" + institucaoAtuacao +
                ", diasDisponiveis=" + diasDisponiveis +
                '}';
    }
}
