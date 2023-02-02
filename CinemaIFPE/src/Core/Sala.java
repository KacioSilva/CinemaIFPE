package Core;

public class Sala {
    private int numero;
    private int qtdPoltronas;

    public Sala(int numero, int qtdPoltronas) {
        this.numero = numero;
        this.qtdPoltronas = qtdPoltronas;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getQtdPoltronas() {
        return qtdPoltronas;
    }

    public void setQtdPoltronas(int qtdPoltronas) {
        this.qtdPoltronas = qtdPoltronas;
    }
    
    
}
