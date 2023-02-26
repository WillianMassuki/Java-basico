
public class TesteReferencias {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Gabi");
		g1.setSalario(1000.0);
		
		EditorVideo ed = new EditorVideo();
		ed.setSalario(1000.0);
		
		Designer d = new Designer();
		d.setSalario(1000.0);
		
		ControleBonificacao cb = new ControleBonificacao();
		cb.registra(g1);
		cb.registra(ed);
		cb.registra(d);
		
		System.out.println(cb.getSoma());
		
		/*
		Funcionario g1 = new Gerente();
		g1.setNome("Willian");
		*/
		
		System.out.println(g1.getNome());
		

	}

}
