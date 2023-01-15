import Database.Conexao;

public class Main {
public static void main(String[] args) {
	Conexao conexao1 = new Conexao();
	conexao1.conectar();
	System.out.println(conexao1.estaConectado());
	conexao1.listarLanches();
}
}
