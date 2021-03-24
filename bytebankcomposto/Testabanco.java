package bytebankcomposto;

public class Testabanco {
	public static void main(String[] args) {
		Cliente wilson = new Cliente();
		wilson.nome = "Wilson Bella";
		wilson.cpf = "222.222.222.22";
		wilson.profissao = "Programador";
		
		Conta contaDoWilson = new Conta();
		contaDoWilson.deposita(100);
		//Associa o cliente Wilson a contaDoWilson
		contaDoWilson.titular = "wilson";
		System.out.println(contaDoWilson.titular.nome);
	}

}
