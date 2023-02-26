
public class TestaCondicional {

	public static void main(String[] args) {

		System.out.println("testando condicionais");

		int idade = 17;
		int quantidadePessoa = 3;

		if (idade >= 18) {
			System.out.println("Precisa se alistar, você tem mais de 18 anos");
		} else {
			if (quantidadePessoa >= 2) {
				System.out.println("Podem entrar, contando que esteja acompanhado");
			} else {
				System.out.println("Você é menor de idade");
			}
		}

	}

}
