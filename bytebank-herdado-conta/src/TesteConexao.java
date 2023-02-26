
public class TesteConexao {

	public static void main(String[] args) throws Exception {
		
		Conexao con = null;
		
		try(Conexao conexao = new Conexao())
		{
			conexao.leDados();
			
			}catch(IllegalStateException ex){
				System.out.println("A conexao deu ruim");
			}
		}
		
		/*
		try {
			con = new Conexao();
			con.leDados();
			con.fecha();
			
		} catch (IllegalStateException ex) {
			System.out.println("A conexao deu ruim");
			
		}finally {
			con.fecha();
		}
	}
	*/

}
