package bytebank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoWilson = new Conta();
		contaDoWilson.saldo = 100;
		contaDoWilson.deposita(50);
		System.out.println(contaDoWilson.saldo);
		boolean conseguiuSacar = contaDoWilson.saca(20);
		System.out.println(contaDoWilson.saldo);
		System.out.println(conseguiuSacar);
		
		Conta contaDaDenise = new Conta();
		contaDaDenise.deposita(1000);
		
		if(contaDaDenise.transfere(300, contaDoWilson)) {
			System.out.println("Transferência feita com sucesso");
		}else {
			System.out.println("Verefire o que houve de errado na transferência");
		}
		
		System.out.println(contaDaDenise.saldo);
		
		System.out.println(contaDoWilson.saldo);
	}
}
