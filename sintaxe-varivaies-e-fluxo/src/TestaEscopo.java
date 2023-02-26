
public class TestaEscopo {

	public static void main(String[] args) {
		System.out.println("testando condicionais");

		int idade = 17;
		int quantidadePessoa = 1;
		boolean acompanhado = true;

		if (quantidadePessoa >= 2) {
			acompanhado = true; // nasce e morre dentro da chave
		} else {
			acompanhado = false;
		}

		if (idade >= 18) {
			// System.out.println("Precisa se alistar, você tem mais de 18 anos");
			System.out.println("Podem entrar, contando que esteja acompanhado");
		} else {

			System.out.println("infelizmente não pode entrar");
		}

	}

}
