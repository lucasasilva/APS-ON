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


}
