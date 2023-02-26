
public class TesteGerente {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setNome("Willian");
		gerente.setCpf("41484566");
		gerente.setSalario(2000.0);
		
		gerente.setSenha(1542);
		
		System.out.println(gerente.getNome());
		System.out.println(gerente.getCpf());
		System.out.println(gerente.getSalario());
		System.out.println(gerente.autentica(1542));
		System.out.println(gerente.getBonificacao());
	}

}
