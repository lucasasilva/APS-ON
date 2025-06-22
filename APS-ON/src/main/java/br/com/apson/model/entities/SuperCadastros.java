package br.com.apson.model.entities;

import br.com.apson.util.getIDGenerico;
import jakarta.persistence.*;


@Entity
@Inheritance (strategy = InheritanceType.JOINED)
@Table (name = "cad_pessoas")
public class SuperCadastros implements getIDGenerico {
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
    @Column (name = "tipo")
    private String tipo;

    public SuperCadastros(String telefoneContato, String emailContato, String login, String senha, String nome, String tipo) {
        this.telefoneContato = telefoneContato;
        this.emailContato = emailContato;
        this.login = login;
        this.senha = senha;
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
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


    public SuperCadastros(String nome,String email,String telefoneContato, String login,String  senha){
        this.nome = nome;
        this.emailContato = email;
        this.telefoneContato = telefoneContato;
        this.senha = senha;
        this.login = login;
    }

    public SuperCadastros(long id, String telefoneContato, String emailContato, String login, String senha, String nome, String tipo) {
        this.id = id;
        this.telefoneContato = telefoneContato;
        this.emailContato = emailContato;
        this.login = login;
        this.senha = senha;
        this.nome = nome;
        this.tipo =tipo;
    }



    @Override
    public String toString() {
        return "Dados \n{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", telefone Contato='" + telefoneContato + '\'' +
                ", email Contato='" + emailContato + '\'' +
                ", login='" + login + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
