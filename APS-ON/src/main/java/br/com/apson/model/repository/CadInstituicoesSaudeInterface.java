package br.com.apson.model.repository;

import br.com.apson.model.entities.CadInstituicoesSaude;

import java.util.List;

public interface CadInstituicoesSaudeInterface {
    void insereNovaInsituicaoSaude(CadInstituicoesSaude cadInstituicoesSaude);
    void alteraInstituicaoSaude(CadInstituicoesSaude cadInstituicoesSaude);

    List<CadInstituicoesSaude> retornarTodasInstituicoesCadastradas();
    CadInstituicoesSaude retornaInstuicaoByID(int id);
    void deletaInstituicao(Long id);
}
