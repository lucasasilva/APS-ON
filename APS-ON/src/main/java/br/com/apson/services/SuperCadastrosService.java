package br.com.apson.services;

import br.com.apson.model.entities.SuperCadastros;
import br.com.apson.model.repository.implementations.SuperCadastrosImplementation;
import br.com.apson.model.repository.SuperCadastrosInterface;

import java.util.List;

public class SuperCadastrosService {
    SuperCadastrosInterface pessoa = new SuperCadastrosImplementation();

    List<SuperCadastros> listPessoas = pessoa.retornaTodasPessoas();
    public String validaLogin (String login, String senha){
        String tipoLogin=null;
        for (SuperCadastros i : listPessoas){
            if (login.equals(i.getLogin()) && senha.equals(i.getSenha())){
                tipoLogin = i.getTipo();
            }
        }
        return tipoLogin;
    }
    public void deletePessoa(Long id){
        pessoa.excluirPessoa(id);
    }
}
