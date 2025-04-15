package br.com.apson.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table (name = "cad_prof_dias_disp")
public class cadProfDiasDisp extends CadProfessores{
    @Column (name = "")
    private int diasDisponiveis;

    public int getDiasDisponiveis() {
        return diasDisponiveis;
    }

    public void setDiasDisponiveis(int dias_disponiveis) {
        this.diasDisponiveis = diasDisponiveis;
    }
}
