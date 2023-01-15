package Core;

public class Sessao {
    private String dataHora;
    private String tipoSessao;

    public Sessao(String dataHora, String tipoSessao) {
        this.dataHora = dataHora;
        this.tipoSessao = tipoSessao;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public String getTipoSessao() {
        return tipoSessao;
    }

    public void setTipoSessao(String tipoSessao) {
        this.tipoSessao = tipoSessao;
    }

}
