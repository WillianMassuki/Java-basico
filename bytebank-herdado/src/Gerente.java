
public class Gerente extends Funcionario implements Autenticavel {
private AutenticaUtil autenticavel;
	
	public Gerente() {
		this.autenticavel = new AutenticaUtil();
	}
	

	@Override
	public void setSenha(int senha) {
		this.autenticavel.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) {
		
		return this.autenticavel.autentica(senha);
	}

	@Override
	public double getBonificacao() {
	
		return 1000;
	}



}
