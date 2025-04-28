package br.com.apson.entities;

import jakarta.persistence.*;
import br.com.apson.util.Enums;
import org.hibernate.engine.internal.Cascade;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;


@Entity
@Table (name = "cad_atividades")
public class CadAtividades {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @Column (name = "tipo_atividade")
    private int tipoAtividade;//APS ou EPS
    @Column (name = "area_atuacao_medica")
    private int areaAtuacaoMedica; //depende da cadAreaAtaucaoMedica
    @Column (name = "instituicao_prestacao")
    private int hospitalPrestacao; //depende da CadInstituicoes;
    @Column (name = "professor_responsável")
    private int professor; //tecnicamente essa bosta pode ser ManyToMany com uma tabela separada, porque um professor por estar em várias atividadese uma atividade pode ter vários professores
    // , mas LeBron James(MVP)
    @Column (name = "qtd_vagas")
    private int quantidadeVagas;
    @Column (name = "dt_inicio")
    private LocalDate dataInicioAtividades;
    @Column (name = "dt_fim")
    private LocalDate dataFimAtividades;


    /* A partir daqui, Deus nos abandonou*/
    @OneToMany (mappedBy = "idAtividade", cascade = CascadeType.REMOVE)
    private List<CadAtividadesHorariosDisponiveis> horariosDisponiveis;

    @OneToMany (mappedBy = "codAtividade", cascade = CascadeType.REMOVE)
    private List<CadAtividadesPeriodos> periodosPermitidos;

    @OneToMany (mappedBy = "codAtividade", cascade =  CascadeType.REMOVE)
    private List<CadAtividadesGrupos>qtdGruposAlunos;

    @OneToMany (mappedBy = "idAtividade", cascade = CascadeType.REMOVE)
    private List<CadAtividadesMesAnoDisp> mesAnoAtividades;

    public CadAtividades() {
    }

    public CadAtividades(int id, int tipoAtividade, int areaAtuacaoMedica, int hospitalPrestacao, int professor, int quantidadeVagas, LocalDate dataInicioAtividades, LocalDate dataFimAtividades, List<CadAtividadesHorariosDisponiveis> horariosDisponiveis, List<CadAtividadesPeriodos> periodosPermitidos, List<CadAtividadesGrupos> qtdGruposAlunos, List<CadAtividadesMesAnoDisp> mesAnoAtividades) {
        this.id = id;
        this.tipoAtividade = tipoAtividade;
        this.areaAtuacaoMedica = areaAtuacaoMedica;
        this.hospitalPrestacao = hospitalPrestacao;
        this.professor = professor;
        this.quantidadeVagas = quantidadeVagas;
        this.dataInicioAtividades = dataInicioAtividades;
        this.dataFimAtividades = dataFimAtividades;
        this.horariosDisponiveis = horariosDisponiveis;
        this.periodosPermitidos = periodosPermitidos;
        this.qtdGruposAlunos = qtdGruposAlunos;
        this.mesAnoAtividades = mesAnoAtividades;
    }

    public CadAtividades(int tipoAtividade, int areaAtuacaoMedica, int hospitalPrestacao, int professor, int quantidadeVagas, LocalDate dataInicioAtividades, LocalDate dataFimAtividades, List<CadAtividadesHorariosDisponiveis> horariosDisponiveis, List<CadAtividadesPeriodos> periodosPermitidos, List<CadAtividadesGrupos> qtdGruposAlunos, List<CadAtividadesMesAnoDisp> mesAnoAtividades) {
        this.tipoAtividade = tipoAtividade;
        this.areaAtuacaoMedica = areaAtuacaoMedica;
        this.hospitalPrestacao = hospitalPrestacao;
        this.professor = professor;
        this.quantidadeVagas = quantidadeVagas;
        this.dataInicioAtividades = dataInicioAtividades;
        this.dataFimAtividades = dataFimAtividades;
        this.horariosDisponiveis = horariosDisponiveis;
        this.periodosPermitidos = periodosPermitidos;
        this.qtdGruposAlunos = qtdGruposAlunos;
        this.mesAnoAtividades = mesAnoAtividades;
    }
    /*TODO: Criar construtores sem aceitar as listas de data, grupo, aluno etc. Para permitir gravar a atividade e posterior alteração
    * */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTipoAtividade() {
        return tipoAtividade;
    }

    public void setTipoAtividade(int tipoAtividade) {
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

    public List<CadAtividadesPeriodos> getPeriodosPermitidos() {
        return periodosPermitidos;
    }

    public void setPeriodosPermitidos(List<CadAtividadesPeriodos> periodosPermitidos) {
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
