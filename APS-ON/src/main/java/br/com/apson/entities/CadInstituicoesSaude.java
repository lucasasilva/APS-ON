package br.com.apson.entities;

import br.com.apson.util.Enums;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadInstituicoesSaude extends SuperCadastros {
    /*
    * TODO refazer essa tabela conforme o banco. Nao pode ser essa lista*/

    private List<CadInstituicoesSaude> instituicoesSaudes = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public List<CadInstituicoesSaude> getInstituicoesSaudes() {
        return instituicoesSaudes;
    }

}
