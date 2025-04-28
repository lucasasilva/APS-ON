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
    private int idAtividade;
    @Column (name = "horarios")
    private LocalTime horarioDisponivel;

}
