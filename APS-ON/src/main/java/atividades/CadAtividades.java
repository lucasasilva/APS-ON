package atividades;

import util.Enums;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

public class CadAtividades {
    private int id;
    private Enums.tipoAtividade tipoAtividade;
    private int areaAtuacaoMedica; //depende da cadAreaAtaucaoMedica
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
