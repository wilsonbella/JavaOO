public class Gerente extends FuncionarioAutenticavel {

	@Override
	public double getBonificacao() {
		System.out.println("Chamando o Método bonificacao do Gerente");
		return super.getSalario() * 0.1;
	}

}