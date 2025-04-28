package br.com.apson.entities;

import jakarta.persistence.*;

import java.time.LocalTime;

@Entity
@Table (name = "cad_ativ_horarios")
public class CadAtividadesHorariosDisponiveis {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn (name = "cod_atividade")
    private CadAtividades idAtividade;
    @Column (name = "horarios")
    private LocalTime horarioDisponivel;

    public CadAtividadesHorariosDisponiveis() {
    }

    public CadAtividadesHorariosDisponiveis(int id, CadAtividades idAtividade, LocalTime horarioDisponivel) {
        this.id = id;
        this.idAtividade = idAtividade;
        this.horarioDisponivel = horarioDisponivel;
    }

    public CadAtividadesHorariosDisponiveis(CadAtividades idAtividade, LocalTime horarioDisponivel) {
        this.idAtividade = idAtividade;
        this.horarioDisponivel = horarioDisponivel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CadAtividades getIdAtividade() {
        return idAtividade;
    }

    public void setIdAtividade(CadAtividades idAtividade) {
        this.idAtividade = idAtividade;
    }

    public LocalTime getHorarioDisponivel() {
        return horarioDisponivel;
    }

    public void setHorarioDisponivel(LocalTime horarioDisponivel) {
        this.horarioDisponivel = horarioDisponivel;
    }
}
