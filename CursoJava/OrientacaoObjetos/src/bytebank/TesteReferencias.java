package bytebank;

public class TesteReferencias {
public static void main(String[] args) {
	Conta primeiraConta = new Conta();
	primeiraConta.saldo = 300;
	System.out.println(primeiraConta.saldo);
	
	Conta segundaConta = primeiraConta;
	primeiraConta.saldo = 200;
	System.out.println(primeiraConta.saldo);
	segundaConta.saldo +=10;
	System.out.println(primeiraConta.saldo);
	System.out.println(segundaConta.saldo);
}
}
