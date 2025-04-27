package br.com.apson.repository;

import java.util.List;
import br.com.apson.entities.CadProfDiasDisp;
import br.com.apson.entities.CadProfessores;

public interface CadProfDiasDispInterface {
    void insereDias(CadProfessores obj);
    List<CadProfDiasDisp> retornaTodoOsDias();
}
