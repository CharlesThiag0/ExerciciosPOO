package teste2;

public class Main {
	public static void main (String [] args) {
		//criar obj
		Conta conta = new Conta();
		conta.setAgencia(31313);
		conta.setValor(1000);
		
		Cliente cliente1 = new Cliente();
		conta.setTitular(cliente1);
		
		conta.getTitular().setProfissao("Progamador");
		conta.getTitular().setCpf("333.333.333-33");
		conta.getTitular().setNome("Charles");
		
		System.out.println(conta.getTitular().getProfissao());
		System.out.println(conta.getTitular().getCpf());
		System.out.println(conta.getTitular().getNome());
	}
}
