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
    public void criarAtividade(CadAtividades atividade){
        if((atividade.getTipoAtividade()!= 1 && atividade.getTipoAtividade()!=2)){
            throw new IllegalArgumentException("tipo de atividade não permitido/não cadastrado");
        }

        cadAtividadesInterface.criarAtividade(atividade);

        cadAtividadesGruposInterface.insereGrupo(atividade);
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
