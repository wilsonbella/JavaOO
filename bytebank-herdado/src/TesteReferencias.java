
public class TesteReferencias {
	public static void main(String[] args) {
		Funcionario g1 = new Gerente();

		g1.setSalario(5500.0);

		Funcionario e = new EditorVideo();

		e.setSalario(3000.0);

		Funcionario d = new Designer();

		d.setSalario(4000.0);

		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(e);
		controle.registra(d);

		System.out.println(controle.getSoma());
	}

}
