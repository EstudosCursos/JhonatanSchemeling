
public class FluxoComError {
private static int i;
public static void main(String[] args) {
	int i=0;
	System.out.println("Ini do main");
	metodo1();
	System.out.println("Fim do main");
}
private static void metodo1() {
	System.out.println("ini do metodo1");
	metodo2();
	System.out.println("Fim do metodo1");
}

private static void metodo2() {
	i++;
	System.out.println("chamando metodo"+i);
	metodo2();
	System.out.println("fim metodo 2");
}
}
