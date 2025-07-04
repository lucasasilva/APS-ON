package br.com.apson.model.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "cad_alunos")
public class CadAlunos extends SuperCadastros {

    @Column(name = "registro_aluno", nullable = false, unique = true)
    private int ra;

    @Column(name = "periodo", nullable = false)
    private int periodo;

    // Construtor padrão
    public CadAlunos() {
    }

    // Construtor com os campo da classe CadAlunos
    public CadAlunos(int ra, int periodo) {
        this.ra = ra;
        this.periodo = periodo;
    }

    // Construtor com os campos herdado da SuperCadastros
    public CadAlunos(long id, String telefoneContato, String emailContato, String login, String senha, String nome, String tipo,  int ra, int periodo) {
        super(id, telefoneContato, emailContato, login, senha, nome, tipo);
        this.ra = ra;
        this.periodo = periodo;
    }

    public CadAlunos(String nome, String email, String telefoneContato, String login, String senha, int ra, int periodo) {
        super(nome, email, telefoneContato, login, senha);
        this.ra = ra;
        this.periodo = periodo;
    }

    // Getters e Setters
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

    @Override
    public String toString() {
        return  super.toString() + " " +
                "ra=" + ra +
                ", periodo=" + periodo +
                "} " ;
    }
}
