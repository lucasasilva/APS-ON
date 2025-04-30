package br.com.apson.services;

import br.com.apson.entities.SuperCadastros;
import br.com.apson.repository.SuperCadastrosImplementation;
import br.com.apson.repository.SuperCadastrosInterface;

import java.util.List;

public class SuperCadastrosService {
    SuperCadastrosInterface pessoa = new SuperCadastrosImplementation();
    List<SuperCadastros> listPessoas = pessoa.retornaTodasPessoas();
    public boolean validaLogin (String login, String senha){
        boolean loginValido = false;
        for (SuperCadastros i : listPessoas){
            if (login.equals(i.getLogin()) && senha.equals(i.getSenha())){
                loginValido = true;
            }
        }
        return loginValido;
    }
}
