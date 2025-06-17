package br.com.apson.model.repository;

import br.com.apson.model.entities.CadProfessores;

import java.util.List;

public interface CadProfessoresRepInterface {
    int criarProfessor(CadProfessores professor);
    void alteraProfessor(CadProfessores professor);

    List<CadProfessores> retornaTodosProfessores();
    CadProfessores retornaProfessorByID(int id);
}
