package main.java.cadastros;

public class CadProfessores  extends SuperCadastros{
    private int id;
    private String nome;
    private Integer tipoCadastro;

    public CadProfessores(int id, String nome, Integer tipoCadastro) {
        this.id = id;
        this.nome = nome;
        this.tipoCadastro = tipoCadastro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getTipoCadastro() {
        return tipoCadastro;
    }

    public void setTipoCadastro(Integer tipoCadastro) {
        this.tipoCadastro = tipoCadastro;
    }
}
