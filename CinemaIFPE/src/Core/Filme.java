package Core;

public class Filme {

    private String nome;
    private String sinopse;
    private String cartaz;
    private String diretor;
    private int duracao;
    private String genero;
    private String anoLancamento;
    private String classIndicativa;
    private String trailer; //talvez não seja usado

    public Filme(String nome, String sinopse, String cartaz, String diretor, int duracao, String genero, String anoLancamento, String classIndicativa, String trailer) {
        this.nome = nome;
        this.sinopse = sinopse;
        this.cartaz = cartaz;
        this.diretor = diretor;
        this.duracao = duracao;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
        this.classIndicativa = classIndicativa;
        this.trailer = trailer;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nomeFilme) {
        this.nome = nomeFilme;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getCartaz() {
        return cartaz;
    }

    public void setCartaz(String cartaz) {
        this.cartaz = cartaz;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getClassIndicativa() {
        return classIndicativa;
    }

    public void setClassIndicativa(String classIndicativa) {
        this.classIndicativa = classIndicativa;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }
}
