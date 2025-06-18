package br.com.apson.model.repository.implementations;

import br.com.apson.model.entities.CadProfessores;
import br.com.apson.model.repository.CadProfessoresRepInterface;
import br.com.apson.util.generics;
import java.util.List;

public class CadProfessoresRepImplementa implements CadProfessoresRepInterface {

    /*Perceba, Ivair, que aqui retornamos um int. Por que?
    Porque o int que retornamos é a id criada para o professor,
    Para que possamos, posteriormente, usá-la na classe/tabela que insere a disponbilidade;
    * */
    @Override
    public int criarProfessor(CadProfessores professor) {
        return generics.insertBancoRetornaID(professor);
    }

    @Override
    public void alteraProfessor(CadProfessores professor) {
        generics.updateBanco(professor);
    }

    @Override
    public List<CadProfessores> retornaTodosProfessores() {
        return generics.selectBanco("from CadProfessores", CadProfessores.class);
    }
    @Override
    public CadProfessores retornaProfessorByID(int id) {
        return generics.selectBancoByID("from CadProfessores", CadProfessores.class, id);
    }
}
