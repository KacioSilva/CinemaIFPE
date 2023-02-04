package Core;

public class Ingresso {
    private int idIgresso;
    private int valor;
    private String sala;
    private String sessao;
    private String nomeFilme;

    public Ingresso(int idIgresso, int valor, String sala, String sessao, String nomeFilme) {
        this.idIgresso = idIgresso;
        this.valor = valor;
        this.sala = sala;
        this.sessao = sessao;
        this.nomeFilme = nomeFilme;
    }

    public int getIdIgresso() {
        return idIgresso;
    }

    public void setIdIgresso(int idIgresso) {
        this.idIgresso = idIgresso;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getSessao() {
        return sessao;
    }

    public void setSessao(String sessao) {
        this.sessao = sessao;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }
}