package bytebank.HerancaInterface;

public class ContaCorrente extends Conta implements Tributavel{

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public double getValorImposto() {
		
		return super.saldo * 0.01;
	}

}
