
public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void saca(double valor) throws SaldoInsuficienteException {
		double ValorASacar = valor + 0.2;
		super.saca(ValorASacar);
	}

	@Override
	public void deposita(double valor) {
	        super.saldo += valor;
	    }
		



}
