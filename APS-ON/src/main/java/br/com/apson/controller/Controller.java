package br.com.apson.controller;

import br.com.apson.model.entities.*;
import br.com.apson.model.repository.*;
import br.com.apson.model.repository.implementations.*;
import br.com.apson.services.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    CadInstuicoesSaudeService instuicoesSaudeService;
    AreaAtuacaoMedicaService areaAtuacaoMedicaService;
    CadProfessoresService professoresService;
    CadAtividadesServices atividadesServices;
    CadAlunosService alunosService;
    SuperCadastrosService pessoa = new SuperCadastrosService();

    public Controller(){
        CadInstituicoesSaudeInterface instituicaoSauderepo = new CadInstituicoesSaudeRepImpInterface();
        this.instuicoesSaudeService = new CadInstuicoesSaudeService(instituicaoSauderepo);

        AreaAtuacaoMedicaRepInterface areaAtuacaoMedicaRepInterface = new AreaAtuacaoMedicaRepImpInterface();
        this.areaAtuacaoMedicaService = new AreaAtuacaoMedicaService(areaAtuacaoMedicaRepInterface);

        CadProfessoresRepInterface profRepo = new CadProfessoresRepImplementa();
        this.professoresService = new CadProfessoresService(profRepo);

        CadAlunosRepInterface alunosRepInterface = new CadAlunosImplementation();
        this.alunosService = new CadAlunosService(alunosRepInterface);

        CadAtividadesInterface atividadesInterface = new CadAtividadesImplementation();
        this.atividadesServices = new CadAtividadesServices(atividadesInterface, new CadAtividadesGruposImplementation ());
    }

    //area atuacao
    public void cadastrarAreaAtuacao(String  nome){
        areaAtuacaoMedicaService.criarAreaAtuacao(new AreaAtuacaoMedica(nome));
    }
    public void excluirAreaA(Long id){
        areaAtuacaoMedicaService.deleteAreaAtuacao(id);
    }
    public List<AreaAtuacaoMedica> retornaTodasAreas(){
        return areaAtuacaoMedicaService.retornaTodasAreasAtuacao();
    }

    //instituicao
    public void cadastrarInstituicao (String nome){
        instuicoesSaudeService.criarInstituicao(new CadInstituicoesSaude(nome));
    }
    public void excluirInstituicao(Long id){
        instuicoesSaudeService.deleteInstituicao(id);
    }
    public List<CadInstituicoesSaude> retornaTodasInstituicoes() {
        return instuicoesSaudeService.retornaTodasInstituicoes();
    }

    //professor e aluno são filhos da cad_pessoas, que faz cascade;
    public void deletarProfessorAluno(Long id){
        pessoa.deletePessoa(id);
    }

    public void cadastrarProfessor(String nome,String email, String telefoneContato, String login, String senha, Integer instituicao, List<String> diasDisp){
        List<CadProfDiasDisp> diasDisponiveis = new ArrayList<>();
        for (String dia : diasDisp){
            diasDisponiveis.add(new CadProfDiasDisp(Integer.parseInt(dia)));
        }
        professoresService.criarProfessor(new CadProfessores(nome,telefoneContato, email, login, senha, instituicao,diasDisponiveis));
    }
    public List<CadProfessores> retornaTodosProfessores(){
        return professoresService.retornaTodosProfessores();
    }

    public void cadastrarAluno(String nome, String email, String telefoneContato, String login, String senha, Integer ra, Integer periodo){
        alunosService.criarAluno(new CadAlunos(nome, email,telefoneContato, login, senha, ra, periodo));
    }
    public List<CadAlunos> retornaTodosAlunos(){
        return alunosService.retornaTodosOsAlunos();
    }


    //atividades
    public void criarAtividade (String tipoAtividade, int areaAtuacao, Integer hospitalPrestaco, Integer professor, Integer qtdVagas,Integer qtdGrupos, LocalDate dataInicio, LocalDate dataFim, String periodos){
            int qtdVagasGrupo = qtdVagas/qtdGrupos;
            List<CadAtividadesGrupos> grupos = new ArrayList<>();
            for (int i =1; i<=qtdGrupos; i++){
                //Na inserção, usamos a quantidade de grupos para criar um "codigo de grupo" e o saldo de vagas sempre  será igual a quantidade de vagas disponíveis
                //para cada grupo durante a inserção;
                grupos.add(new CadAtividadesGrupos(null,i,qtdVagasGrupo, qtdVagasGrupo));
            }
            atividadesServices.criarAtividade(new CadAtividades(tipoAtividade,areaAtuacao,hospitalPrestaco,professor,qtdVagas,dataInicio,dataFim, periodos, grupos ), qtdVagas, qtdVagas);
    }

}
