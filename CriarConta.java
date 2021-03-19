package bytebank;

public class CriarConta {
	public static void main(String[] args) {
		//	Instância de conta
		Conta primeiraConta = new Conta();
		System.out.println("Endereço de memória da primeira conta " + primeiraConta);

		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		
		System.out.println(primeiraConta.saldo);
		
		
		// Segunda instância da conta
		Conta segundaConta = new Conta();
		System.out.println("Endereço de memória da seguynda conta " + segundaConta);
		segundaConta.saldo = 50;
		System.out.println("A primeira conta tem " + primeiraConta.saldo);
		System.out.println("A segunda conta tem " + segundaConta.saldo);
		
		
	}

}
 