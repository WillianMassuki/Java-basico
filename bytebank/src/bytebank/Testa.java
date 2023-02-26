package bytebank;

public class Testa {
	public static void main(String[] args) {
		
		Conta contadaMarcela = new Conta(1754, 2654);
		System.out.println(contadaMarcela.getAgencia());
		
		Conta conta2 = new Conta(17845, 5456);
		
		Conta conta3 = new Conta(45854, 545461);
		
		System.out.println("numero total das contas é de: " + Conta.getTotal());
		
		
		Cliente marcela = new Cliente();
		marcela.setNome("marcela");
		
		contadaMarcela.setTitular(marcela);
		System.out.println(contadaMarcela.getTitular().getNome());
		
		contadaMarcela.getTitular().setProfissao("Programador");
		
	//	contadaMarcela.titular = new Cliente();
		
		//contadaMarcela.titular.nome = "Marcela";
	//	System.out.println(contadaMarcela.titular.nome);
		
	}
	

}
