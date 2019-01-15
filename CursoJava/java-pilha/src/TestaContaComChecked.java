
public class TestaContaComChecked {
public static void main(String[] args) {
	Conta c = new Conta();
	
	try {
		c.deposita();	
	}catch(MinhaExcecao mx) {
		System.out.println("Tratamento minha excecao");
	}
	
}
}
