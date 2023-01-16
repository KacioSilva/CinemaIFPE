import Core.Administrador;
import Database.Conexao;

public class Main {
public static void main(String[] args) {
	Administrador administrador = new Administrador();
	Conexao conexao1 = new Conexao();
	conexao1.conectar();
	//conexao1.listarLanches();
	conexao1.lanche1();
	System.out.println(conexao1.getNome());
	System.out.println(conexao1.getMarca());
	System.out.println(conexao1.getPreco());
	System.out.println(conexao1.getQuantidade());

	}
}
