package cadastros;

import util.Enums;

public class CadAlunos {
    private long registroAluno;
    private Enums.periodos periodo;

    public long getRegistroAluno() {
        return registroAluno;
    }

    public void setRegistroAluno(long registroAluno) {
        this.registroAluno = registroAluno;
    }

    public Enums.periodos getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Enums.periodos periodo) {
        this.periodo = periodo;
    }
}
