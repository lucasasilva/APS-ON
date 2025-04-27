package br.com.apson.repository;

import br.com.apson.entities.AreaAtuacaoMedica;
import br.com.apson.entities.CadAlunos;

import java.awt.geom.Area;
import java.util.List;

public interface AreaAtuacaoMedicaRepInterface {
    void cadastrarAreaAtuacaoMedica(AreaAtuacaoMedica areaAtuacaoMedica);
    void alterarCadastroAreaAtuacaoMedica(AreaAtuacaoMedica areaAtuacaoMedica);

    List<AreaAtuacaoMedica> retornaTodasAreasCadastradas();
    AreaAtuacaoMedica retornaAreaAtuacaoByID(int id);
}
