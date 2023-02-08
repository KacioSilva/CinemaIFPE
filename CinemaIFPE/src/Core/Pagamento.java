package Core;

import java.sql.SQLException;

import Database.Conexao;

public class Pagamento {
    private static String tipo;
    private static String email;
    private static String nomeTitular;
    
  
    public static String getEmail() {
		return email;
	}

	public static void setEmail(String email) {
		Pagamento.email = email;
	}

	public static String getNomeTitular() {
		return nomeTitular;
	}

	public static void setNomeTitular(String nomeTitular) {
		Pagamento.nomeTitular = nomeTitular;
	}

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
    
    public static boolean validacao(String textEmail, String textCpf, String textNCartao, String textNomeTitular, String textCvv) throws RuntimeException {
    	
        if(textEmail.isEmpty() ||  textCpf.isBlank() || textNCartao.isBlank() || textNomeTitular.isBlank() || textCvv.isBlank()) {
            throw new RuntimeException ("Preencha todos os campos");
         
        }else if(textCpf.length() < 11) {
        	throw new RuntimeException("CPF inválido.");
        }else if(textNCartao.length() < 16) {
        	throw new RuntimeException("Número de cartão inválido.");
        }else if(textCvv.length() < 3) {
        	throw new RuntimeException("CVV inválido.");
        }else {
        	nomeTitular = textNomeTitular;
        	email = textEmail;
        
            return true;  
            
        }
	}	
}
