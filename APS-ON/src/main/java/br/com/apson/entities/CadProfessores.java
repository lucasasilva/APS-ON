package br.com.apson.entities;

import jakarta.persistence.*;
import br.com.apson.util.Enums;

import java.util.List;

@Entity
@Table (name = "cad_professores")
public class CadProfessores  extends SuperCadastros {
    @Column (name = "instituicao_trabalho")
    private int institucaoAtuacao;

    @OneToMany(mappedBy = "idProfessor", cascade = CascadeType.REMOVE)
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

    public CadProfessores(String nome, String login, String senha, int institucaoAtuacao, List<CadProfDiasDisp> diasDisponiveis){
        super(nome, login, senha);
        this.institucaoAtuacao = institucaoAtuacao;
        this.diasDisponiveis = diasDisponiveis;
    }

    public CadProfessores(String login, String senha, int institucaoAtuacao) {
        super(login, senha);
        this.institucaoAtuacao = institucaoAtuacao;
    }

    public CadProfessores(String nome, int id, String senha, String login, String email, int institucaoAtuacao) {
        super(nome, id, senha, login, email);
        this.institucaoAtuacao = institucaoAtuacao;
    }

    public CadProfessores(long id, String telefoneContato, String emailContato, String login, String senha, String nome, String tipo, int institucaoAtuacao) {
        super(id, telefoneContato, emailContato, login, senha, nome, tipo);
        this.institucaoAtuacao = institucaoAtuacao;
    }

    public CadProfessores(long id, String nome, String emailContato, int institucaoAtuacao) {
        super(id, nome, emailContato);
        this.institucaoAtuacao = institucaoAtuacao;
    }

    public CadProfessores(){
        
    }


}
