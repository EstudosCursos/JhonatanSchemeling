package bytebank.herdado;

public class TesteReferencias {
	public static void main(String[] args) {
		Funcionario g1 = new Gerente();
		g1.setNome("Marcos");
		String nome = g1.getNome();

		System.out.println(nome);
		
		g1.setSalario(5000.0);
		
		
	ControleBonificacao controle = new ControleBonificacao();
	controle.registra(g1);
	
	System.out.println(controle.getSoma());
	}

}
