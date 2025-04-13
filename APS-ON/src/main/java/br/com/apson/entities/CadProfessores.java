package br.com.apson.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import br.com.apson.util.Enums;

@Entity
@Table (name = "cad_professores")
public class CadProfessores  extends SuperCadastros {
    @Column (name = "instituicao_trabalho")
    private int institucaoAtuacao;


    public int getInstitucaoAtuacao() {
        return institucaoAtuacao;
    }

    public void setInstitucaoAtuacao(int institucaoAtuacao) {
        this.institucaoAtuacao = institucaoAtuacao;
    }
}
