package br.com.apson.repository;

import br.com.apson.entities.CadProfDiasDisp;
import br.com.apson.entities.CadProfessores;
import br.com.apson.entities.SuperCadastros;
import br.com.apson.util.generics;

import java.util.List;

public class CadProfessoresRepImp implements CadProfessoresRepInterface{
    @Override
    public void criarProfessor(CadProfessores professor) {
        generics.insertBanco(professor);
    }

    @Override
    public void alteraProfessor(CadProfessores professor) {
        generics.updateBanco(professor);
    }

    @Override
    public List<CadProfessores> retornarProfessor() {
        return generics.selectBanco("from CadProfessores", CadProfessores.class);
    }
}
