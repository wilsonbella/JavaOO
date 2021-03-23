package bytebankcomposto;

public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaDaDenise = new Conta();
		System.out.println(contaDaDenise.saldo);
		
		contaDaDenise.titular = new Cliente();
		System.out.println(contaDaDenise.titular);
		
		contaDaDenise.titular.nome = "Denise";
		System.out.println(contaDaDenise.titular.nome);
	}

}
