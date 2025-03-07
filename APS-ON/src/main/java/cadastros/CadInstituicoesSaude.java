package cadastros;

import java.util.Map;

public class CadInstituicoesSaude {
    private Map<Integer, String> cadInstituicoes;

    public Map<Integer, String> getCadInstituicoes() {
        return cadInstituicoes;
    }

    public void setCadInstituicoes(Map<Integer, String> cadInstituicoes) {
        this.cadInstituicoes = cadInstituicoes;
    }

    public boolean fValidaCadInstituicao(Integer chave){
        return this.cadInstituicoes.containsKey(chave);
    }




}
