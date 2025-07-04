package br.com.apson.model.repository.implementations;

import br.com.apson.model.entities.CadInstituicoesSaude;
import br.com.apson.model.repository.CadInstituicoesSaudeInterface;
import br.com.apson.util.generics;

import java.util.List;

public class CadInstituicoesSaudeRepImpInterface implements CadInstituicoesSaudeInterface {
    @Override
    public void insereNovaInsituicaoSaude(CadInstituicoesSaude cadInstituicoesSaude) {
        generics.insertBanco(cadInstituicoesSaude);
    }

    @Override
    public void alteraInstituicaoSaude(CadInstituicoesSaude cadInstituicoesSaude) {
        generics.updateBanco(cadInstituicoesSaude);
    }

    @Override
    public List<CadInstituicoesSaude> retornarTodasInstituicoesCadastradas() {
        return generics.selectBanco("from CadInstituicoesSaude", CadInstituicoesSaude.class);
    }

    @Override
    public CadInstituicoesSaude retornaInstuicaoByID(int id) {
        return generics.selectBancoByID("from CadInstituicoesSaude", CadInstituicoesSaude.class, id);
    }

    @Override
    public void deletaInstituicao(Long id) {
        generics.deleteBanco(id, CadInstituicoesSaude.class);
    }
}
