
public class TestaContaComExcecaoChecke {

	public static void main(String[] args) {
		Conta c = new Conta();
		
		try {
			c.deposita();
		} catch (MinhaExcecao e) {
			System.out.println("Deu ruim");
			e.printStackTrace();
		}

	}

}
