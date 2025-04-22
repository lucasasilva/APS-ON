package br.com.apson.repository;

import br.com.apson.entities.AreaAtuacaoMedica;
import br.com.apson.util.generics;
import java.util.List;

public class AreaAtuacaoMedicaRepImpInterface implements AreaAtuacaoMedicaRepInterface{
    @Override
    public void cadastrarAreaAtuacaoMedica(AreaAtuacaoMedica areaAtuacaoMedica) {
        generics.insertBanco(areaAtuacaoMedica);
    }

    @Override
    public void alterarCadastroAreaAtuacaoMedica(AreaAtuacaoMedica areaAtuacaoMedica) {
        generics.updateBanco(areaAtuacaoMedica);
    }

    @Override
    public List<AreaAtuacaoMedica> retornaTodasAreasCadastradas() {
        return generics.selectBanco("from AreaAtuacaoMedica", AreaAtuacaoMedica.class);
    }
}
