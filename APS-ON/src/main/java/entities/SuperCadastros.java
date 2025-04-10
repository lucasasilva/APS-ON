package entities;

import jakarta.persistence.*;
import util.Enums;
@Entity
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
    private String Nome;


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

    public String getNome(){ return Nome; }

    public void setNome(String nome) { this.Nome = nome; }



    //construtores
    public SuperCadastros(){};
    public SuperCadastros(String login, String senha){
        this.login= login;
        this.senha= senha;
    }

    public SuperCadastros(String Nome,int  id,String  senha,String login,String email){
        this.Nome = Nome;
        this.id = id;
        this.senha = senha;
        this.login = login;
        this.emailContato = email;
    }
}
