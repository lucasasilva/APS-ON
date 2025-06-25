package br.com.apson.services;

import br.com.apson.model.entities.AreaAtuacaoMedica;
import br.com.apson.model.repository.AreaAtuacaoMedicaRepInterface;


import java.util.List;

public class AreaAtuacaoMedicaService {
    AreaAtuacaoMedicaRepInterface service;

    public AreaAtuacaoMedicaService(AreaAtuacaoMedicaRepInterface service) {
        this.service = service;
    }

    public void criarAreaAtuacao(AreaAtuacaoMedica obj){
        if (obj.getNome()== null||obj.getNome().isBlank()){
            throw new IllegalArgumentException("Nome da area não pode estar vazio");
        }else{
            service.cadastrarAreaAtuacaoMedica(obj);
        }
    }

    public void alterarAreaAtuacao(AreaAtuacaoMedica obj){
        if (obj.getNome()== null||obj.getNome().isBlank()){
            throw new IllegalArgumentException("Nome da area não pode estar vazio");
        }else{
            service.alterarCadastroAreaAtuacaoMedica(obj);
        }
    }
    public AreaAtuacaoMedica retornaAreaMedicaByID(int id){
       return service.retornaAreaAtuacaoByID(id);
    }
    public List<AreaAtuacaoMedica> retornaTodasAreasAtuacao(){
        return service.retornaTodasAreasCadastradas();
    }

    public void deleteAreaAtuacao(Long id){
        service.deletaAreaAtuacao(id);
    }
}
