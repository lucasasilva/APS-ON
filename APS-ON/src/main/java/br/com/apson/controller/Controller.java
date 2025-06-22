package br.com.apson.controller;

import br.com.apson.model.entities.AreaAtuacaoMedica;
import br.com.apson.model.entities.CadInstituicoesSaude;
import br.com.apson.model.repository.AreaAtuacaoMedicaRepInterface;
import br.com.apson.model.repository.CadAtividadesInterface;
import br.com.apson.model.repository.CadInstituicoesSaudeInterface;
import br.com.apson.model.repository.CadProfessoresRepInterface;
import br.com.apson.model.repository.implementations.AreaAtuacaoMedicaRepImpInterface;
import br.com.apson.model.repository.implementations.CadInstituicoesSaudeRepImpInterface;
import br.com.apson.model.repository.implementations.CadProfessoresRepImplementa;
import br.com.apson.services.AreaAtuacaoMedicaService;
import br.com.apson.services.CadInstuicoesSaudeService;
import br.com.apson.services.CadProfessoresService;

public class Controller {
    CadInstuicoesSaudeService instuicoesSaudeService;
    AreaAtuacaoMedicaService areaAtuacaoMedicaService;
    CadProfessoresService professoresService;

    public Controller(){
        CadInstituicoesSaudeInterface instituicaoSauderepo = new CadInstituicoesSaudeRepImpInterface();
        this.instuicoesSaudeService = new CadInstuicoesSaudeService(instituicaoSauderepo);

        AreaAtuacaoMedicaRepInterface areaAtuacaoMedicaRepInterface = new AreaAtuacaoMedicaRepImpInterface();
        this.areaAtuacaoMedicaService = new AreaAtuacaoMedicaService(areaAtuacaoMedicaRepInterface);

        CadProfessoresRepInterface profRepo = new CadProfessoresRepImplementa();
        this.professoresService = new CadProfessoresService(profRepo);
    }

    public void cadastrarAreaAtuacao(String  nome){
        AreaAtuacaoMedica obj = new AreaAtuacaoMedica(nome);
        areaAtuacaoMedicaService.criarAreaAtuacao(obj);
    }
    public void cadastrarInstituicao (String nome){
        CadInstituicoesSaude obj = new CadInstituicoesSaude(nome);
        instuicoesSaudeService.criarInstituicao(obj);
    }
}
