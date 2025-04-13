package entities;

import jakarta.persistence.*;
import util.Enums;

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
    private Enums.tipoAtividade tipoAtividade;
    @Column (name = "area_atuacao_medica")
    private int areaAtuacaoMedica; //depende da cadAreaAtaucaoMedica
    @Column (name = "")
    private int hospitalPrestacao; //depende da CadInstituicoes;
    private int professor; //depende da cadProfessores
    private int quantidadeVagas;

    /* A partir daqui, Deus nos abandonou*/
    private LocalDate dataInicioAtividades;
    private LocalDate dataFimAtividades;
    private List<LocalTime> horariosDisponiveis;
    private List<Enums.periodos> periodosPermitidos;
    private List<Enums.disponibilidadeDias> diasDisponiveisSemana;

    public void exibeAtividade() {
        System.out.println("ID: " + id);
        System.out.println("Tipo de Atividade: " + tipoAtividade);
        System.out.println("Área de Atuação Médica: " + areaAtuacaoMedica);
        System.out.println("Hospital de Prestação: " + hospitalPrestacao);
        System.out.println("Professor Responsável: " + professor);
        System.out.println("Quantidade de Vagas: " + quantidadeVagas);
        System.out.println("Data de Início: " + dataInicioAtividades);
        System.out.println("Data de Fim: " + dataFimAtividades);
        System.out.println("Horários Disponíveis: " + horariosDisponiveis);
        System.out.println("Períodos Permitidos: " + periodosPermitidos);
        System.out.println("Dias Disponíveis na Semana: " + diasDisponiveisSemana);
    }

}
