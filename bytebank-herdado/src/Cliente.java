
public class Cliente implements Autenticavel{
	
	private AutenticaUtil autenticavel;
	
	public Cliente() {
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
	
	
	


}
