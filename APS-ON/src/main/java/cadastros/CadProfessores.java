package cadastros;

import util.Enums;
public class CadProfessores  extends SuperCadastros {

    private Enums.disponibilidadeDias disponibilidadeDias;
    private int institucaoAtuacao;

    public Enums.disponibilidadeDias getDisponibilidadeDias() {
        return disponibilidadeDias;
    }

    public void setDisponibilidadeDias(Enums.disponibilidadeDias disponibilidadeDias) {
        this.disponibilidadeDias = disponibilidadeDias;
    }

    public int getInstitucaoAtuacao() {
        return institucaoAtuacao;
    }

    public void setInstitucaoAtuacao(int institucaoAtuacao) {
        this.institucaoAtuacao = institucaoAtuacao;
    }
}
