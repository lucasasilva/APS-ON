package br.com.apson.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "cad_alunos")
public class CadAtividadesAlunos extends SuperCadastros{
    @Id
    private int ra;

    private int period;

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    @Override
    public String toString() {
        return "CadAtividadesAlunos{" +
                "ra=" + ra +
                ", period=" + period +
                '}';
    }
}
