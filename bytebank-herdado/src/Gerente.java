//Gerente herda de Funcionario e assina a interface Autenticavel

public class Gerente extends Funcionario implements Autenticavel {

	private int senha;

	@Override
	public double getBonificacao() {
		System.out.println("Chamando o Método bonificacao do Gerente");
		return super.getSalario() * 0.1;
	}

	@Override
	public void setSenha(int senha) {

		this.senha = senha;
	}

	@Override
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}

	}

}