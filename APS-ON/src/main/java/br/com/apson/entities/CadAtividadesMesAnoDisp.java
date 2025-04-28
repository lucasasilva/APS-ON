package br.com.apson.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (name = "cad_atividades_mes_ano")
public class CadAtividadesMesAnoDisp {
    /*
    cad_atividades_mes_ano e cad_atividades_dia_mes. Por que?
        Porque trabalhar com data, especialmente com o volume de datas que vamos trabalhar, é um C# (Salve Bill Gates. Se não entendeu a piada, procura C# na internet).
        Então, em vez de só gravar numa tabela só, potencialmente 365 registros por atividade, onde 1 campo seria um date ou varchar e quebrar com a indexação,
     eu achei melhor trabalhar com granularidade, quebrando a data em 2 registros separados:
        1 - Mês, ano e código da atividade;
        2 - Dias do mês que aquela atividade está disponível;
   É chato na hora de fazer os joins, vamos ter que ver como isso se comporta no front principalmente, mas data retrieve é o de menos quando os dados já estão lá
    * */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private CadAtividades idAtividade;
    @Column (name = "mes")
    private int mes;
    @Column (name = "ano")
    private  int ano;

    @OneToMany (mappedBy = "idMesAno", cascade = CascadeType.REMOVE)
    private List<CadAtividadesDiaMes> diasDoMesAtividade;

    public CadAtividadesMesAnoDisp() {
    }

    public CadAtividadesMesAnoDisp(int id, CadAtividades idAtividade, int mes, int ano, List<CadAtividadesDiaMes> diasDoMesAtividade) {
        this.id = id;
        this.idAtividade = idAtividade;
        this.mes = mes;
        this.ano = ano;
        this.diasDoMesAtividade = diasDoMesAtividade;
    }

    public CadAtividadesMesAnoDisp(CadAtividades idAtividade, int mes, int ano, List<CadAtividadesDiaMes> diasDoMesAtividade) {
        this.idAtividade = idAtividade;
        this.mes = mes;
        this.ano = ano;
        this.diasDoMesAtividade = diasDoMesAtividade;
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

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public List<CadAtividadesDiaMes> getDiasDoMesAtividade() {
        return diasDoMesAtividade;
    }

    public void setDiasDoMesAtividade(List<CadAtividadesDiaMes> diasDoMesAtividade) {
        this.diasDoMesAtividade = diasDoMesAtividade;
    }
}
