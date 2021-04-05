
public class TesteReferencias {
	public static void main(String[] args) {
		Funcionario g1 = new Gerente();


		g1.setSalario(5500.0);

		Funcionario f = new Funcionario();

		f.setSalario(2000.0);
		
		Funcionario e = new EditorVideo();
		
		e.setSalario(3000.0);

		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(f);
		controle.registra(e);

		System.out.println(controle.getSoma());
	}

}
