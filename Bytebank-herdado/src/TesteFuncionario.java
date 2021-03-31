
public class TesteFuncionario {

	public static void main(String[] args) {
		
       Funcionario wilson = new Funcionario();
       wilson.setNome("Wilson Bella");
       wilson.setCpf("365458654");
       wilson.setSalario(3200.00);
       System.out.println(wilson.getNome());
       System.out.println(wilson.getCpf());
       System.out.println(wilson.getSalario());
       System.out.println(wilson.getBonificacao());
		
	}

}
