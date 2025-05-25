package br.com.apson.services;

import br.com.apson.entities.CadInstituicoesSaude;
import br.com.apson.entities.CadProfessores;
import br.com.apson.repository.*;
import br.com.apson.repository.implementations.CadInstituicoesSaudeRepImpInterface;
import br.com.apson.repository.implementations.CadProfDiasDispRepImplementa;

import java.util.List;

public class CadProfessoresService {
    CadProfessoresRepInterface cadProfessoresRepInterface;

    public CadProfessoresService(CadProfessoresRepInterface cadProfessoresRepInterface) {
        this.cadProfessoresRepInterface = cadProfessoresRepInterface;
    }


    public void criarProfessor(CadProfessores obj){
        obj.setTipo("P");//Se acessou como professor, então o tipo é sempre isso. Boa prática? Como diria o rei T'Chala: "Nós não fazemos isso aqui".

        //Valida se a instituicao apontada existe. Se não existe, mais abaixo no código, joga um exception
        CadInstituicoesSaudeInterface cadInstituicoesSaude = new CadInstituicoesSaudeRepImpInterface();
        List<CadInstituicoesSaude> instituicoesCadastradas = cadInstituicoesSaude.retornarTodasInstituicoesCadastradas();
        boolean vValidaInstuicao = false;
        for (CadInstituicoesSaude instituicao : instituicoesCadastradas) {
            if (obj.getInstitucaoAtuacao() == instituicao.getId()) {
                vValidaInstuicao = true;
                break;
            }
        }

        //valida o resto dos campos not null
        if (obj.getNome() == null || obj.getNome().isBlank()){
            throw new IllegalArgumentException("Nome não pode estar vazio");
        }
        if (obj.getLogin() == null || obj.getLogin().isBlank()){
            throw new IllegalArgumentException("Login não pode estar vazio");
        }
        if (obj.getSenha() == null || obj.getSenha().isBlank()){
            throw new IllegalArgumentException("Senha não pode estar vazio");
        }
        if (!vValidaInstuicao){
            throw new IllegalArgumentException("Instituição não cadastrada");
        } if (obj.getDiasDisponiveis() == null || obj.getDiasDisponiveis().isEmpty()){
            throw new IllegalArgumentException("Apontar pelo menos 1 dia de disponibilidade");
        }
        //se deu tudo certo, insere o professor e retorna o código
        cadProfessoresRepInterface.criarProfessor(obj);

        //Agora vem a magia da televisão: Inserir os dias que o professor tem disponíveis;
        CadProfDiasDispInterface cadProfDiasDisp = new CadProfDiasDispRepImplementa();
        cadProfDiasDisp.insereDias(obj);

    }

    public void alterarProfessor(CadProfessores obj){
        obj.setTipo("P");
        //Valida se a instituição apontada existe. Se não existe, mais abaixo no código, joga uma exception
        CadInstituicoesSaudeInterface cadInstituicoesSaude = new CadInstituicoesSaudeRepImpInterface();
        List<CadInstituicoesSaude> instituicoesCadastradas = cadInstituicoesSaude.retornarTodasInstituicoesCadastradas();
        boolean vValidaInstuicao = false;
        for (CadInstituicoesSaude instituicao : instituicoesCadastradas) {
            if (obj.getInstitucaoAtuacao() == instituicao.getId()) {
                vValidaInstuicao = true;
                break;
            }
        }

        //valida o resto dos campos not null
        if (obj.getNome() == null || obj.getNome().isBlank()){
            throw new IllegalArgumentException("Nome não pode estar vazio");
        }
        if (obj.getLogin() == null || obj.getLogin().isBlank()){
            throw new IllegalArgumentException("Login não pode estar vazio");
        }
        if (obj.getSenha() == null || obj.getSenha().isBlank()){
            throw new IllegalArgumentException("Senha não pode estar vazio");
        }
        if (!vValidaInstuicao){
            throw new IllegalArgumentException("Instituição não cadastrada");
        }
        //se deu tudo certo, insere o professor e retorna o código
        cadProfessoresRepInterface.alteraProfessor(obj);

        //TODO
        //EXCLUIR DIAS QUE NÃO FOREM SELECIONADOS PELO USUÁRIO NA ALTERAÇÃO
    }

    //Retorna os professores cadastrados
    public CadProfessores retornaProfessorById(int id){
        return cadProfessoresRepInterface.retornaProfessorByID(id);
    }
    public List<CadProfessores> retornaTodosProfessores(){
        return cadProfessoresRepInterface.retornaTodosProfessores();
    }

}
