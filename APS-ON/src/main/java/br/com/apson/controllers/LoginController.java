package br.com.apson.controllers;

import br.com.apson.entities.CadProfessores;
import br.com.apson.entities.SuperCadastros;
import br.com.apson.repository.SuperCadastrosRepInterface;
import br.com.apson.repository.implementations.CadProfessoresRepImplementa;
import br.com.apson.repository.CadProfessoresRepInterface;

//o tipo de input que será recebido. Serve para especificar que será recebido um JSON
import br.com.apson.repository.implementations.SuperCadastrosInterfaceImplementation;
import jakarta.ws.rs.Consumes;
//Importa o méto-do "post"
import jakarta.ws.rs.POST;
//@Path, para passar o caminho da API
import jakarta.ws.rs.Path;
//O tipo de arquivo que é retornado por este endpoint
import jakarta.ws.rs.Produces;

//serve para
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

// Exemplo de Controller
@Path("/login")
public class LoginController {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response validarLogin(SuperCadastros login) {
        boolean valido = false;
        SuperCadastrosRepInterface usuario = new SuperCadastrosInterfaceImplementation();
        List<SuperCadastros> listPessoas = usuario.retornadaTodosUsuarios();
        for (SuperCadastros i : listPessoas){
            if (login.getLogin().equals(i.getLogin())){
                valido = true;
                break;
            }
        }

        if (valido) {
            return Response.ok().build(); // 200 OK
        } else {
            return Response.status(Response.Status.UNAUTHORIZED).build(); // 401 Unauthorized
        }
    }
}

