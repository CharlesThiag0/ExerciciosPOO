package vendaDeCarro;

public class Main {
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Charles", "777.777.777-77", 22);
		Carro carro1 = new Carro("Toyota", "Corola", 2019, 150.000);
		DadosCompra compra1 = new DadosCompra(cliente1, carro1);
		
		compra1.resultShow();
		
	}
	
}
