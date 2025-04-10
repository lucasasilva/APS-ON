package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import util.Enums;

@Entity
@Table (name = "cad_professores")
public class CadProfessores  extends SuperCadastros {

    @Id
    private int id;
    private Enums.disponibilidadeDias disponibilidadeDias;
    private int institucaoAtuacao;


    public Enums.disponibilidadeDias getDisponibilidadeDias() {
        return disponibilidadeDias;
    }

    public void setDisponibilidadeDias(Enums.disponibilidadeDias disponibilidadeDias) {
        this.disponibilidadeDias = disponibilidadeDias;
    }

    public int getInstitucaoAtuacao() {
        return institucaoAtuacao;
    }

    public void setInstitucaoAtuacao(int institucaoAtuacao) {
        this.institucaoAtuacao = institucaoAtuacao;
    }
}
