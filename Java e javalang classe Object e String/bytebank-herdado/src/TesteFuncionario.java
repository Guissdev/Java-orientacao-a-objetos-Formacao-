
public class TesteFuncionario {

	public static void main(String[] args) {
		
		
		Cliente cliente = new Cliente();
		
		
		
		Gerente guilherme = new Gerente();
		guilherme.setNome("Guilherme Santos");
		guilherme.setCpf("223355646-9");
		guilherme.setSalario(2600.00);

		System.out.println(guilherme.getNome());
		System.out.println(guilherme.getBonificacao());
		
		//guilherme.salario = 300.0;
		
	}

}
