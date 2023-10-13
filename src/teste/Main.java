package teste;

public class Main {
	public static void main (String[] args) {
		//criar obj
		Conta conta = new Conta();
		conta.setAgencia(131313);
		conta.setNumero(88);
		conta.setSaldo(100);
		
		//criar obj e compossição de obj
		Cliente charles = new Cliente();
		conta.setTitular(charles);
		conta.getTitular().setNome("Charles");
		System.out.println(conta.getTitular().getNome());
		
	}
}
