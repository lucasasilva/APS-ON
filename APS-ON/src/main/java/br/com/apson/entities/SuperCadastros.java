package br.com.apson.entities;

import jakarta.persistence.*;

@Entity
@Inheritance (strategy = InheritanceType.JOINED)
@Table (name = "cad_pessoas")
public class SuperCadastros {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    @Column (name = "telefone")
    private String telefoneContato;
    @Column (name = "email")
    private String emailContato;
    @Column (name = "login")
    private String login;
    @Column (name = "senha")
    private String senha;
    @Column (name = "nome")
    private String nome;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }

    public String getEmailContato() {
        return emailContato;
    }

    public void setEmailContato(String emailContato) {
        this.emailContato = emailContato;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome(){ return nome; }

    public void setNome(String nome) { this.nome = nome; }



    //construtores
    public SuperCadastros(){};
    public SuperCadastros(String login, String senha){
        this.login= login;
        this.senha= senha;
    }

    public SuperCadastros(String nome,int  id,String  senha,String login,String email){
        this.nome = nome;
        this.id = id;
        this.senha = senha;
        this.login = login;
        this.emailContato = email;
    }

    public SuperCadastros(long id, String telefoneContato, String emailContato, String login, String senha, String nome) {
        this.id = id;
        this.telefoneContato = telefoneContato;
        this.emailContato = emailContato;
        this.login = login;
        this.senha = senha;
        this.nome = nome;
    }

    public SuperCadastros(long id, String nome, String emailContato) {
        this.id = id;
        this.nome = nome;
        this.emailContato = emailContato;
    }

}
