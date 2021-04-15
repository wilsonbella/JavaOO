public class Gerente extends Funcionario {

	@Override
	public double getBonificacao() {
		System.out.println("Chamando o Método bonificacao do Gerente");
		return super.getSalario() * 0.1;
	}

}