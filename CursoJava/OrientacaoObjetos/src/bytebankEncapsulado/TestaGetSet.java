package bytebankEncapsulado;

public class TestaGetSet {
public static void main(String[] args) {
	Conta conta = new Conta(1337, 24226);
	conta.setNumero(1337);
	System.out.println(conta.getNumero());
	
	Cliente paulo = new Cliente();
	
	paulo.setNome("Paulo Silveira");
	conta.setTitular(paulo);
	System.out.println(conta.getTitular().getNome());
	
	conta.getTitular().setProfissao("programador");
	System.out.println(conta.getTitular().getProfissao());
	
	Conta conta2 = new Conta(1338,24227);
	conta.transfere(-10, conta2);
	System.out.println(conta2.pegaSaldo());
	
	System.out.println(Conta.getTotal());
}
}
