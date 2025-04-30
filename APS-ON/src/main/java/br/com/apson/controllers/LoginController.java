package br.com.apson.controllers;

import br.com.apson.entities.CadProfessores;
import br.com.apson.repository.CadProfessoresRepImplementa;
import br.com.apson.repository.CadProfessoresRepInterface;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

// Exemplo de Controller
@Path("/login")
public class LoginController {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response validarLogin(CadProfessores login) {
        boolean valido = false;
        CadProfessoresRepInterface professor = new CadProfessoresRepImplementa();
        List<CadProfessores> listProf = professor.retornaTodosProfessores();
        for (CadProfessores i : listProf){
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

