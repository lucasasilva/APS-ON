package br.com.apson.services;

import br.com.apson.model.entities.CadAtividades;
import br.com.apson.model.repository.CadAtividadesGruposInterface;
import br.com.apson.model.repository.CadAtividadesInterface;

import java.util.List;

public class CadAtividadesServices {

    private CadAtividadesInterface cadAtividadesInterface;
    private CadAtividadesGruposInterface cadAtividadesGruposInterface;

    public CadAtividadesServices (CadAtividadesInterface cadAtividadesInterface, CadAtividadesGruposInterface cadAtividadesGruposInterface){
        this.cadAtividadesInterface = cadAtividadesInterface;
        this.cadAtividadesGruposInterface = cadAtividadesGruposInterface;
    }

    //implementar o restante das validações, ou não, porque com spring isso aqui fica bem mais fácil
    public void criarAtividade(CadAtividades atividade, int qtdVagas, int qtdVagasSobrando){
       cadAtividadesInterface.criarAtividade(atividade);

        cadAtividadesGruposInterface.insereGrupo(atividade, qtdVagas, qtdVagasSobrando);
    }

    public void alterarAtividade(CadAtividades atividades){
        cadAtividadesInterface.alterarAtividade(atividades);
    }

    public List<CadAtividades> retornaTodasAtividades(){
        return cadAtividadesInterface.retornaTodasAsAtividade();
    }

    public  void deleteAtividade(Long id){
        cadAtividadesInterface.deletaAtividade(id);
    }
}
