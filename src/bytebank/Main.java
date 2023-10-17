package bytebank;

public class Main {
	public static void main(String[] args) {
		//criação do obj e popular
		
		Cliente charles = new Cliente("Charles", "333.333.333-33", "Futuro Back-End");
		Conta conta1 = new Conta(charles, 1313, 1000);
		
		Cliente thiago = new Cliente("Thiago", "777.777.777-77", "Futuro Devensolvedor");
		Conta conta2 = new Conta(thiago, 1515, 10);
	
		conta1.setTitular(charles);
		System.out.println(Conta.getTotalDeContas());

		//conta1.resultShow();
		//conta1.setAgencia(-1313);
		
		/*if (conta1.depositar(1000)) {
			conta1.sucesso();
			conta1.mostrarSaldo();
		} else {
			conta1.falhou();
			conta1.mostrarSaldo();
		}
		
		if (conta1.sacar(5000)) {
			conta1.sucesso();
			conta1.mostrarSaldo();
		} else {
			conta1.falhou();
			conta1.mostrarSaldo();
		}*/
		
		/*if (conta1.tranferir(5000, conta2)) {
			conta1.sucesso();
			conta1.mostrarSaldo();
			System.out.println("Conta destino saldo : " + conta2.getSaldo());
		} else {
			conta1.falhou();
			conta1.mostrarSaldo();
			System.out.println("Conta destino saldo : " + conta2.getSaldo());
		}*/
		
	}
}
