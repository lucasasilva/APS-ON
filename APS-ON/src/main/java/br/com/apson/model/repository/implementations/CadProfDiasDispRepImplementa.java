package br.com.apson.model.repository.implementations;


import br.com.apson.model.entities.CadProfDiasDisp;
import br.com.apson.model.entities.CadProfessores;
import br.com.apson.model.repository.CadProfDiasDispInterface;
import br.com.apson.util.generics;

import java.util.List;

public class CadProfDiasDispRepImplementa implements CadProfDiasDispInterface {

    @Override
    public void insereDias( CadProfessores obj) {
        /*aqui é meio confuso, mas urso comigo: Os dias disponíveis não herdam de ninguém. Certo?
        * Então, quando inserimos o professor, um ID de professor será gerado e, quando inserimos um dia disponível,
        * esse ID é uma chave estrangeira.
        * Dessa forma, precisamos destrinchar a lista de dias que recebemos do front (um array) em unidades inviduais e passar o ID do professor
        * Mass, como existe uma relação entre as duas tabelas, o hibernate espera O OBJETO INTEIRO
        * Por que não só obj.getId()? Não consegui achar uma resposta convincente, mas é o que é né...*/
        for (CadProfDiasDisp i : obj.getDiasDisponiveis()){
            CadProfDiasDisp diasDisp = new CadProfDiasDisp(obj, i.getDiasDisponiveis());
            generics.insertBanco(diasDisp);
        }
    }


    @Override
    public List<CadProfDiasDisp> retornaTodoOsDias() {
        return generics.selectBanco("from CadProfDiasDisp", CadProfDiasDisp.class);
    }
}
