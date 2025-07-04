package br.com.apson.model.entities;

import br.com.apson.util.getIDGenerico;
import jakarta.persistence.*;


import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;


@Entity
@Table (name = "cad_atividades")
public class CadAtividades implements getIDGenerico, Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @Column (name = "tipo_atividade")
    private String tipoAtividade;//APS ou EPS
    @Column (name = "area_atuacao_medica")
    private int areaAtuacaoMedica; //depende da cadAreaAtaucaoMedica
    @Column (name = "instituicao_prestacao")
    private int hospitalPrestacao; //depende da CadInstituicoes;
    @Column (name = "professor_responsavel")
    private int professor; //tecnicamente essa bosta pode ser ManyToMany com uma tabela separada, porque um professor por estar em várias atividadese uma atividade pode ter vários professores
    // , mas LeBron James(MVP)
    @Column (name = "qtd_vagas")
    private int quantidadeVagas;
    @Column (name = "dt_inicio")
    private LocalDate dataInicioAtividades;
    @Column (name = "dt_fim")
    private LocalDate dataFimAtividades;
    //@OneToMany (mappedBy = "codAtividade", cascade = CascadeType.REMOVE)
    @Column(name = "periodo")
    private String periodosPermitidos;


    /* A partir daqui, Deus nos abandonou*/
    @OneToMany (mappedBy = "idAtividade", cascade = CascadeType.REMOVE)
    private List<CadAtividadesHorariosDisponiveis> horariosDisponiveis;

    //grupos
    @OneToMany (mappedBy = "codAtividade", cascade =  CascadeType.REMOVE)
    private List<CadAtividadesGrupos>qtdGruposAlunos;

    @OneToMany (mappedBy = "idAtividade", cascade = CascadeType.REMOVE)
    private List<CadAtividadesMesAnoDisp> mesAnoAtividades;

    public CadAtividades() {
    }

    @Override
    public String getNome() {
        return "";
    }

    public CadAtividades(String tipoAtividade, int areaAtuacaoMedica, int hospitalPrestacao, int professor, int quantidadeVagas, LocalDate dataInicioAtividades, LocalDate dataFimAtividades,String periodos, List<CadAtividadesGrupos> qtdGruposAlunos) {
        this.tipoAtividade = tipoAtividade;
        this.areaAtuacaoMedica = areaAtuacaoMedica;
        this.hospitalPrestacao = hospitalPrestacao;
        this.professor = professor;
        this.quantidadeVagas = quantidadeVagas;
        this.dataInicioAtividades = dataInicioAtividades;
        this.dataFimAtividades = dataFimAtividades;
        this.periodosPermitidos = periodos;
        this.qtdGruposAlunos = qtdGruposAlunos;
    }

    public CadAtividades(int id, String tipoAtividade, int areaAtuacaoMedica, int hospitalPrestacao, int professor, int quantidadeVagas, LocalDate dataInicioAtividades, LocalDate dataFimAtividades, String periodosPermitidos, List<CadAtividadesHorariosDisponiveis> horariosDisponiveis, List<CadAtividadesGrupos> qtdGruposAlunos, List<CadAtividadesMesAnoDisp> mesAnoAtividades) {
        this.id = id;
        this.tipoAtividade = tipoAtividade;
        this.areaAtuacaoMedica = areaAtuacaoMedica;
        this.hospitalPrestacao = hospitalPrestacao;
        this.professor = professor;
        this.quantidadeVagas = quantidadeVagas;
        this.dataInicioAtividades = dataInicioAtividades;
        this.dataFimAtividades = dataFimAtividades;
        this.periodosPermitidos = periodosPermitidos;
        this.horariosDisponiveis = horariosDisponiveis;
        this.qtdGruposAlunos = qtdGruposAlunos;
        this.mesAnoAtividades = mesAnoAtividades;
    }

    /*TODO: Criar construtores sem aceitar as listas de data, grupo, aluno etc. Para permitir gravar a atividade e posterior alteração
    * */

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoAtividade() {
        return tipoAtividade;
    }

    public void setTipoAtividade(String tipoAtividade) {
        this.tipoAtividade = tipoAtividade;
    }

    public int getAreaAtuacaoMedica() {
        return areaAtuacaoMedica;
    }

    public void setAreaAtuacaoMedica(int areaAtuacaoMedica) {
        this.areaAtuacaoMedica = areaAtuacaoMedica;
    }

    public int getHospitalPrestacao() {
        return hospitalPrestacao;
    }

    public void setHospitalPrestacao(int hospitalPrestacao) {
        this.hospitalPrestacao = hospitalPrestacao;
    }

    public int getProfessor() {
        return professor;
    }

    public void setProfessor(int professor) {
        this.professor = professor;
    }

    public int getQuantidadeVagas() {
        return quantidadeVagas;
    }

    public void setQuantidadeVagas(int quantidadeVagas) {
        this.quantidadeVagas = quantidadeVagas;
    }

    public LocalDate getDataInicioAtividades() {
        return dataInicioAtividades;
    }

    public void setDataInicioAtividades(LocalDate dataInicioAtividades) {
        this.dataInicioAtividades = dataInicioAtividades;
    }

    public LocalDate getDataFimAtividades() {
        return dataFimAtividades;
    }

    public void setDataFimAtividades(LocalDate dataFimAtividades) {
        this.dataFimAtividades = dataFimAtividades;
    }

    public List<CadAtividadesHorariosDisponiveis> getHorariosDisponiveis() {
        return horariosDisponiveis;
    }

    public void setHorariosDisponiveis(List<CadAtividadesHorariosDisponiveis> horariosDisponiveis) {
        this.horariosDisponiveis = horariosDisponiveis;
    }

    public String getPeriodosPermitidos() {
        return periodosPermitidos;
    }

    public void setPeriodosPermitidos(String periodosPermitidos) {
        this.periodosPermitidos = periodosPermitidos;
    }

    public List<CadAtividadesGrupos> getQtdGruposAlunos() {
        return qtdGruposAlunos;
    }

    public void setQtdGruposAlunos(List<CadAtividadesGrupos> qtdGruposAlunos) {
        this.qtdGruposAlunos = qtdGruposAlunos;
    }

    public List<CadAtividadesMesAnoDisp> getMesAnoAtividades() {
        return mesAnoAtividades;
    }

    public void setMesAnoAtividades(List<CadAtividadesMesAnoDisp> mesAnoAtividades) {
        this.mesAnoAtividades = mesAnoAtividades;
    }
}
