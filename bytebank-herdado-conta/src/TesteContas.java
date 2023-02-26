
public class TesteContas {

	public static void main(String[] args) throws SaldoInsuficienteException  {
		ContaCorrente cc = new ContaCorrente(151, 666);
		cc.deposita(100);
		
	//	ContaPoupanca cp = new ContaPoupanca(666, 666);
		//cp.deposita(10);
		try {
			cc.saca(110);
			System.out.println("O valor do saldo da conta corrente é de: " + cc.getSaldo());
			//System.out.println("O valor do saldo da conta poupanca é de: " + cp.getSaldo());
			
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
		System.out.println(cc.getSaldo());
		

	}

}
