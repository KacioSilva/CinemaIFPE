package Core;

public class Lanche {
    private int idLanche;
    private String nomeLanche;
    private String marca;
    private int preco;
    private int qtdEstoque;

    public Lanche(int idLanche, String nomeLanche, String marca, int preco, int qtdEstoque) {
        this.idLanche = idLanche;
        this.nomeLanche = nomeLanche;
        this.marca = marca;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }

    public int getIdLanche() {
        return idLanche;
    }

    public void setIdLanche(int idLanche) {
        this.idLanche = idLanche;
    }

    public String getNomeLanche() {
        return nomeLanche;
    }

    public void setNomeLanche(String nomeLanche) {
        this.nomeLanche = nomeLanche;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }
}
