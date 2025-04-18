package cadastros;

import util.Enums;

public class SuperCadastros {
    private long id;
    private Enums.tipoCadastro tipoCadastro;
    private String telefoneContato;
    private String emailContato;
    private String login;
    private String senha;
    private String Nome;
    private String alunos;
    private String Periodo;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Enums.tipoCadastro getTipoCadastro() {
        return tipoCadastro;
    }

    public void setTipoCadastro(Enums.tipoCadastro tipoCadastro) {
        this.tipoCadastro = tipoCadastro;
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

    public void add(String alunos) {this.alunos = alunos;}

    public String getNome(){ return Nome; }

    public void setNome(String nome) { this.Nome = nome; }

    public String getPeriodo(){ return Periodo; }

    public void setPeriodo(String Periodo){ this.Periodo = Periodo; }

    //construtores
    public SuperCadastros(){};
    public SuperCadastros(String login, String senha){
        this.login= login;
        this.senha= senha;
    }
}
