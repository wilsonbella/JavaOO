
public class TesteContas {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(121, 121);
		cc.deposita(100.0);

		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.0);

		cc.transfere(10.0, cp);

		System.out.println("A cc possui :" + cc.getSaldo());

		System.out.println("A cp possui :" + cp.getSaldo());
	}
}
