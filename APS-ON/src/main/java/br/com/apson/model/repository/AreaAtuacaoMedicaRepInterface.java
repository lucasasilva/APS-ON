package br.com.apson.model.repository;

import br.com.apson.model.entities.AreaAtuacaoMedica;

import java.util.List;

public interface AreaAtuacaoMedicaRepInterface {
    void cadastrarAreaAtuacaoMedica(AreaAtuacaoMedica areaAtuacaoMedica);
    void alterarCadastroAreaAtuacaoMedica(AreaAtuacaoMedica areaAtuacaoMedica);

    List<AreaAtuacaoMedica> retornaTodasAreasCadastradas();
    AreaAtuacaoMedica retornaAreaAtuacaoByID(int id);
}
