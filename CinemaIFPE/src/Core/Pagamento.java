package Core;

public class Pagamento {
    private String tipo;

    public Pagamento(String tipo) {
        this.tipo = tipo;
    }

    public String resumoPagamento(){
        String detalhamneto = "Detalhamento da compra";
        return detalhamneto;
    }

    public void emitirNota(){
        //Emitir nota
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
