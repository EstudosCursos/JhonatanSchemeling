package Conexao;

public class TesteConexao {
public static void main(String[] args) {
	
	try(Conexao conexao = new Conexao()){
		conexao.leDados();
	}catch(IllegalStateException ise) {
		System.out.println("Excecao: " + ise.getMessage());
	}
	
	
	
	//----------------------------------------------------
//	
//	/*
//	 * Conexao con = new Conexao();
//	 * try {
//		con.leDados();
//		
//	}catch(IllegalStateException ise) {
//		System.out.println("Excecao: " + ise.getMessage());
//	}finally {
//		//con.fecha();
//	}
//	*/
}
}
