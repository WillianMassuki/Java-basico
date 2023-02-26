
public class TestaCondicional2 {

	public static void main(String[] args) {
		System.out.println("testando condicionais");

		int idade = 17;
		int quantidadePessoa = 1;
		boolean acompanhado = quantidadePessoa >= 2;

		if (idade >= 18 || acompanhado) {
			// System.out.println("Precisa se alistar, você tem mais de 18 anos");
			System.out.println("Podem entrar, contando que esteja acompanhado");
		} else {

			System.out.println("infelizmente não pode entrar");
		}

	}

}
