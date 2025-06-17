package br.com.apson.model.entities;

import jakarta.persistence.*;

@Entity
@Table (name = "cad_prof_dias_disp")
public class CadProfDiasDisp {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int id;
    @Column (name = "dia_semana")
    private int diasDisponiveis;
    @ManyToOne
    @JoinColumn(name = "id_professor")
    private CadProfessores idProfessor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CadProfessores getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(CadProfessores professor) {
        this.idProfessor = idProfessor;
    }

    public int getDiasDisponiveis() {
        return diasDisponiveis;
    }

    public void setDiasDisponiveis(int dias_disponiveis) {
        this.diasDisponiveis = diasDisponiveis;
    }

    //construtores

    public CadProfDiasDisp(int id, int diasDisponiveis, CadProfessores idProfessor) {
        this.id = id;
        this.diasDisponiveis = diasDisponiveis;
        this.idProfessor = idProfessor;
    }

    public CadProfDiasDisp( CadProfessores idProfessor, int diasDisponiveis ){
        this.idProfessor = idProfessor;
        this.diasDisponiveis = diasDisponiveis;
    }
    public CadProfDiasDisp (int diasDisponiveis){
        this.diasDisponiveis = diasDisponiveis;
    }

    public CadProfDiasDisp() {
    }

    @Override
    public String toString() {
        return "" +
                 diasDisponiveis +
                ' ';
    }
}
