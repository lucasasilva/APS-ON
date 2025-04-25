package br.com.apson.repository;

import br.com.apson.entities.CadProfessores;
import br.com.apson.entities.SuperCadastros;

import java.util.List;

public interface CadProfessoresRepInterface {
    int criarProfessor(CadProfessores professor);
    void alteraProfessor(CadProfessores professor);

    List<CadProfessores> retornaTodosProfessores();
    CadProfessores retornaProfessorByID(int id);
}
