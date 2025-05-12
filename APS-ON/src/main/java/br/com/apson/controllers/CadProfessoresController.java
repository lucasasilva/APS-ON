package br.com.apson.controllers;


import br.com.apson.entities.CadProfessores;
import br.com.apson.repository.implementations.CadProfessoresRepImplementa;
import br.com.apson.services.CadProfessoresService;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.awt.*;

@Path("/cadprofessor")
public class CadProfessoresController {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response cadastrarProfessor(CadProfessores novoProfessor){
        CadProfessoresService professor = new CadProfessoresService(new CadProfessoresRepImplementa());
        professor.criarProfessor(novoProfessor);

    }
}
