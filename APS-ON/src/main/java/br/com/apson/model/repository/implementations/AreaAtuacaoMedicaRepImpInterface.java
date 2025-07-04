package br.com.apson.model.repository.implementations;

import br.com.apson.model.entities.AreaAtuacaoMedica;
import br.com.apson.model.repository.AreaAtuacaoMedicaRepInterface;
import br.com.apson.util.generics;
import java.util.List;

public class AreaAtuacaoMedicaRepImpInterface implements AreaAtuacaoMedicaRepInterface {
    @Override
    public void cadastrarAreaAtuacaoMedica(AreaAtuacaoMedica areaAtuacaoMedica) {
        generics.insertBanco(areaAtuacaoMedica);
    }//coisa

    @Override
    public void alterarCadastroAreaAtuacaoMedica(AreaAtuacaoMedica areaAtuacaoMedica) {
        generics.updateBanco(areaAtuacaoMedica);
    }

    @Override
    public List<AreaAtuacaoMedica> retornaTodasAreasCadastradas() {
        return generics.selectBanco("from AreaAtuacaoMedica", AreaAtuacaoMedica.class);
    }

    @Override
    public AreaAtuacaoMedica retornaAreaAtuacaoByID(int id) {
        return generics.selectBancoByID("from AreaAtuacaoMedica", AreaAtuacaoMedica.class, id);
    }

    @Override
    public void deletaAreaAtuacao(Long id) {
        generics.deleteBanco(id, AreaAtuacaoMedica.class);
    }
}
