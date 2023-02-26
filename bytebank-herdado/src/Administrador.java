
public class Administrador extends Funcionario implements Autenticavel{
	private AutenticaUtil autenticavel;
	
	public Administrador() {
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
		// TODO Auto-generated method stub
		return 0;
	}

	

}
