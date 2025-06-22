package br.com.apson.controller;

import br.com.apson.model.entities.AreaAtuacaoMedica;
import br.com.apson.model.entities.CadInstituicoesSaude;
import br.com.apson.model.entities.CadProfDiasDisp;
import br.com.apson.model.entities.CadProfessores;
import br.com.apson.model.repository.*;
import br.com.apson.model.repository.implementations.*;
import br.com.apson.services.AreaAtuacaoMedicaService;
import br.com.apson.services.CadAtividadesServices;
import br.com.apson.services.CadInstuicoesSaudeService;
import br.com.apson.services.CadProfessoresService;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    CadInstuicoesSaudeService instuicoesSaudeService;
    AreaAtuacaoMedicaService areaAtuacaoMedicaService;
    CadProfessoresService professoresService;
    CadAtividadesServices atividadesServices;

    public Controller(){
        CadInstituicoesSaudeInterface instituicaoSauderepo = new CadInstituicoesSaudeRepImpInterface();
        this.instuicoesSaudeService = new CadInstuicoesSaudeService(instituicaoSauderepo);

        AreaAtuacaoMedicaRepInterface areaAtuacaoMedicaRepInterface = new AreaAtuacaoMedicaRepImpInterface();
        this.areaAtuacaoMedicaService = new AreaAtuacaoMedicaService(areaAtuacaoMedicaRepInterface);

        CadProfessoresRepInterface profRepo = new CadProfessoresRepImplementa();
        this.professoresService = new CadProfessoresService(profRepo);

        CadAtividadesInterface atividadesInterface = new CadAtividadesImplementation();
        this.atividadesServices = new CadAtividadesServices(atividadesInterface, new CadAtividadesGruposImplementation ());
    }

    public void cadastrarAreaAtuacao(String  nome){
        AreaAtuacaoMedica obj = new AreaAtuacaoMedica(nome);
        areaAtuacaoMedicaService.criarAreaAtuacao(obj);
    }
    public void cadastrarInstituicao (String nome){
        CadInstituicoesSaude obj = new CadInstituicoesSaude(nome);
        instuicoesSaudeService.criarInstituicao(obj);
    }

    public List<CadInstituicoesSaude> retornaTodasInstituicoes() {
        return instuicoesSaudeService.retornaTodasInstituicoes();
    }

    public void cadastrarProfessor(String nome,String email, String telefoneContato, String login, String senha, Integer instituicao, List<String> diasDisp){
        List<CadProfDiasDisp> diasDisponiveis = new ArrayList<>();
        for (String dia : diasDisp){
            diasDisponiveis.add(new CadProfDiasDisp(Integer.parseInt(dia)));
        }
        CadProfessores novoProfessor =  new CadProfessores(nome,telefoneContato, email, login, senha, instituicao,diasDisponiveis);
        professoresService.criarProfessor(novoProfessor);
    }
}
