
public class MinhaExcecao extends RuntimeException { //unchecked

	public MinhaExcecao() {}
	
	public MinhaExcecao(String msg) {
		super(msg);
	}
}
