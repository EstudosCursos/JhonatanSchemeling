package bytebank.Exception;

public class ContaPoupanca extends Conta{
	
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor+0.2); 
			destino.deposita(valor);
		}
	}

