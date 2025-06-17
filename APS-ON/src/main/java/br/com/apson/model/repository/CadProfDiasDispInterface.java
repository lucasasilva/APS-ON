package br.com.apson.model.repository;

import java.util.List;
import br.com.apson.model.entities.CadProfDiasDisp;
import br.com.apson.model.entities.CadProfessores;

public interface CadProfDiasDispInterface {
    void insereDias(CadProfessores obj);
    List<CadProfDiasDisp> retornaTodoOsDias();
}
