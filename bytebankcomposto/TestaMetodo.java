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
		
	}
}
