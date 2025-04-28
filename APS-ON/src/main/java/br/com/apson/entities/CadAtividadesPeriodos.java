package br.com.apson.entities;

import jakarta.persistence.*;

@Entity
@Table (name = "cad_ativ_periodos")
public class CadAtividadesPeriodos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn (name = "cod_atividade")
    private CadAtividades codAtividade;
    @Column (name = "periodo")
    private int periodosPermitidos;

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

    public int getPeriodosPermitidos() {
        return periodosPermitidos;
    }

    public void setPeriodosPermitidos(int periodosPermitidos) {
        this.periodosPermitidos = periodosPermitidos;
    }


    public CadAtividadesPeriodos() {
    }

    public CadAtividadesPeriodos(int periodosPermitidos) {
        this.periodosPermitidos = periodosPermitidos;
    }

    public CadAtividadesPeriodos(CadAtividades codAtividade, int periodosPermitidos) {
        this.codAtividade = codAtividade;
        this.periodosPermitidos = periodosPermitidos;
    }

    public CadAtividadesPeriodos(int id, CadAtividades codAtividade, int periodosPermitidos) {
        this.id = id;
        this.codAtividade = codAtividade;
        this.periodosPermitidos = periodosPermitidos;
    }
}
