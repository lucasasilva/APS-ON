package br.com.apson.entities;

import br.com.apson.util.Enums;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadAlunos extends SuperCadastros {


    private int periodo;
    private int ra;

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }


}
