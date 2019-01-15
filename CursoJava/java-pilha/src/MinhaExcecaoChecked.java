
public class MinhaExcecaoChecked extends Exception { //checked porque extende a exception diretamente

	public MinhaExcecaoChecked() {}
	
	public MinhaExcecaoChecked(String msg) {
		super(msg);
	}
}
