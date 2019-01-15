package bytebank.Exception;

import bytebank.composto.Cliente;

public abstract class Conta {
	double saldo;
	int agencia,numero;
	Cliente titular;
	
	public Conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
	}
	public void deposita(double valor){
		this.saldo += valor;
	}
	
	public void saca(double valor) throws SaldoInsuficienteException{
		if(this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: "+this.saldo + ", Valor: " + valor);
		}
		
		this.saldo -= valor;
	}
	
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException{
		this.saca(valor); 
		destino.deposita(valor);
	}
	public double pegaSaldo() {
		return this.saldo;
	}

}
