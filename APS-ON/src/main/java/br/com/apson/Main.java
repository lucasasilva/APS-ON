package br.com.apson;

import br.com.apson.entities.CadProfDiasDisp;
import br.com.apson.entities.CadProfessores;

import br.com.apson.repository.implementations.CadProfessoresRepImplementa;
import br.com.apson.services.CadProfessoresService;

import java.util.*;

public class Main {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);

        /* Aqui passamos a query que queremos usar como parâmetro do select genérico.
        * Importante: Se queremos somente alguns campos (e não todos os campos da classe/objeto) temos que passar:
        * String query = "select new br.com.apson.entities.classe (campo1, campo2, campo3) from nomeDaClasse"
        * e ter um construtor na classe com os campos estamos retornando na ordem, senão dá pau
        * Isso também mantém legibilidade, visto que os babuínos que lerão isso sempre saberão de onde
        * estão vindo os dados
        *
        * ABAIXO DOIS EXEMPLOS DE COMO FAZÊ-LO*/
//        String query = "from SuperCadastros";
//
//        List<SuperCadastros> pessoas  = generics.selectBanco(query, SuperCadastros.class);
//
//        for (SuperCadastros pessoa:pessoas){
//            System.out.println(pessoa.toString());
//        }
//        sc.close();


        //CadInstuicoesSaudeService cadInstuicoesSaudeService = new CadInstuicoesSaudeService(new CadInstituicoesSaudeRepImpInterface());
        //CadInstituicoesSaude novaInstituicao = new CadInstituicoesSaude("Upa Vila A");
        //cadInstuicoesSaudeService.criarInstituicao(novaInstituicao);
  //      List<CadInstituicoesSaude> lista =  cadInstuicoesSaudeService.retornaTodasInstituicoes();
//        CadInstituicoesSaude retorno = cadInstuicoesSaudeService.retornaInstuicaoByID(2);
//        for (CadInstituicoesSaude item : lista){
//            System.out.println(item.getId()+":"+item.getNome());
//        }
//
//        System.out.println("\nRetorno de um id: \n");
//        System.out.println(retorno.getId()+":"+retorno.getNome());
        List<CadProfDiasDisp> dias = new ArrayList<>();
        dias.add(new CadProfDiasDisp(1));
        dias.add(new CadProfDiasDisp(2));
        dias.add(new CadProfDiasDisp(3));
        CadProfessoresService professor = new CadProfessoresService(new CadProfessoresRepImplementa());
        CadProfessores novoProfessor = new CadProfessores();
        novoProfessor.setId(4);
        novoProfessor.setNome("Lucas");
        novoProfessor.setLogin("lucas.silva@gmail.com");
        novoProfessor.setSenha("@!@asdDDGG#");
        novoProfessor.setInstitucaoAtuacao(1);
        novoProfessor.setDiasDisponiveis(dias);

        //professor.criarProfessor(novoProfessor);
        //professor.alterarProfessor(novoProfessor);

        List<CadProfessores> professores = professor.retornaTodosProfessores();
        for(CadProfessores i: professores){
            System.out.println("id: "+ i.getId() + " Nome: "+ i.getNome() +", Login"+ i.getLogin()+", " + ", dias disp: ");
        }


    }
}

