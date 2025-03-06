package br.com.apson;

import cadastros.AreaAtuacaoMedica;
import cadastros.CadInstituicoesSaude;
import cadastros.CadProfessores;
import util.Enums;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
         AreaAtuacaoMedica  areaAtuacaoMedica = new AreaAtuacaoMedica();
         List<String> areasAtuacaoMedicaList = new ArrayList<>();
         List<CadInstituicoesSaude> cadInstituicoesSaudeList = new ArrayList<>();

         CadProfessores professores = new CadProfessores();
         List<CadProfessores> professoresLista = new ArrayList<>();

        areaAtuacaoMedica.setId(1);
        areaAtuacaoMedica.setNome("Pediatria");

        areasAtuacaoMedicaList.set(areaAtuacaoMedica.get());

        System.out.println(areasAtuacaoMedicaList);

}

