package bytebank.herdado;

public class TesteFuncionario {
public static void main(String[] args) {
	
	Funcionario nico = new Funcionario();
	nico.setNome("Nico Steppat");
	nico.setCpf("16061878729");
	nico.setSalario(2690.00);
	
	System.out.println(nico.getNome());
	System.out.println(nico.getBonificacao());
	
	//FuncionarioTeste f1 = new FuncionarioTeste();
	//f1.setSalario(3000);
//	f1.setTipo(2);
	//System.out.println(f1.getBonificacao());
	
}
}
