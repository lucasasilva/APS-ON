package br.com.apson.repository;

import br.com.apson.entities.CadInstituicoesSaude;

import java.util.List;

public interface CadInstituicoesSaudeInterface {
    void insereNovaInsituicaoSaude(CadInstituicoesSaude cadInstituicoesSaude);
    void alteraInstituicaoSaude(CadInstituicoesSaude cadInstituicoesSaude);

    List<CadInstituicoesSaude> retornarTodasInstituicoesCadastradas();
}
