package bytebank;

public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero) {
		total++;
		System.out.println("O total das contas é de: " + total);
		//super();
		//this.saldo = saldo;
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 100;
	//	this.titular = titular;
	}
	
	

	public static int getTotal() {
		return Conta.total;
	}



	public static void setTotal(int total) {
		Conta.total = total;
	}



	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public void deposita(double valor)
	{
		this.saldo += valor;
	}
	
	public boolean saca(double valor)
	{
		if(this.saldo >= saldo)
		{
			this.saldo -= valor;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino)
	{
		if(this.saldo >= saldo)
		{
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}
	
	public double PegaSaldo()
	{
		return this.saldo;
	}

}
