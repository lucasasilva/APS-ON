package br.com.apson.entities;

import jakarta.persistence.*;

@Entity
@Table (name = "cad_atividades_dias_mes")
public class CadAtividadesDiaMes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn (name = "id_mes_ano")
    private CadAtividadesMesAnoDisp idMesAno;
    @Column (name = "id_ativdade")
    private int idAtividade;
    @Column (name = "dia_mes")
    private int diaDoMes;

}
