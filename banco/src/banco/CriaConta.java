package banco;

public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200.00;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo +=100;
		System.out.println("Primeira conta tem " + primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50.00;
		System.out.println("A segunda conta tem " + segundaConta.saldo);
		
		System.out.println("A agencia da primeira conta: " + primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		
		segundaConta.agencia = 146;
		
		System.out.println("A agencia da segundaConta: "  + segundaConta.agencia);
		
	}

}
