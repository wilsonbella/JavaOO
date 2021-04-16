//Gerente herda de Funcionario e assina a interface Autenticavel

public class Gerente extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;

	@Override
	public double getBonificacao() {
		System.out.println("Chamando o Método bonificacao do Gerente");
		return super.getSalario() * 0.1;
	}

	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);

	}

	@Override
	public boolean autentica(int senha) {
		return autenticador.autentica(senha);

	}

}