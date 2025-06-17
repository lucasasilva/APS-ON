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

    public CadAtividadesDiaMes() {
    }

    public CadAtividadesDiaMes(int id, CadAtividadesMesAnoDisp idMesAno, int idAtividade, int diaDoMes) {
        this.id = id;
        this.idMesAno = idMesAno;
        this.idAtividade = idAtividade;
        this.diaDoMes = diaDoMes;
    }

    public CadAtividadesDiaMes(CadAtividadesMesAnoDisp idMesAno, int idAtividade, int diaDoMes) {
        this.idMesAno = idMesAno;
        this.idAtividade = idAtividade;
        this.diaDoMes = diaDoMes;
    }
}
