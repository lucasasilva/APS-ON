package br.com.apson.services;

import br.com.apson.model.entities.CadInstituicoesSaude;
import br.com.apson.model.repository.CadInstituicoesSaudeInterface;

import java.util.List;

public class CadInstuicoesSaudeService {
    CadInstituicoesSaudeInterface cadInstituicoesSaude;

    public CadInstuicoesSaudeService(CadInstituicoesSaudeInterface cadInstituicoesSaude) {
        this.cadInstituicoesSaude = cadInstituicoesSaude;
    }

    public void criarInstituicao(CadInstituicoesSaude obj){
        if (obj.getNome() == null|| obj.getNome().isBlank()){
            throw new IllegalArgumentException("Nome não pode estar vazio");
        }
        cadInstituicoesSaude.insereNovaInsituicaoSaude(obj);
    }
    public void alterarInstituicao(CadInstituicoesSaude obj){
        if (obj.getNome() == null|| obj.getNome().isBlank()){
            throw new IllegalArgumentException("Nome não pode estar vazio");
        }
        cadInstituicoesSaude.alteraInstituicaoSaude(obj);
    }
    public List<CadInstituicoesSaude> retornaTodasInstituicoes(){
        return cadInstituicoesSaude.retornarTodasInstituicoesCadastradas();
    }
    public CadInstituicoesSaude retornaInstuicaoByID(int id){
        return cadInstituicoesSaude.retornaInstuicaoByID(id);
    }
}
