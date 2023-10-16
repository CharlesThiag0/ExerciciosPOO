package livraria;

public class Main {
	public static void main(String[] args) {
	Endereco endereco1 = new Endereco("Rua das palmas", "Fortaleza", 61930040);
	Cliente cliente1 = new Cliente(endereco1, "Charles", 22, 'M');
	Caixa caixa1 = new Caixa(21.99, 1000, 28);
	Biblioteca biblioteca1 = new Biblioteca(endereco1, cliente1, caixa1, "CyberPunk2077");
	
	biblioteca1.setEndereco(endereco1);
	biblioteca1.setCliente(cliente1);
	biblioteca1.setCaixa(caixa1);
	
	biblioteca1.calcularTroco();
	biblioteca1.resultShow();
	System.out.println("===========================================");
	
	Endereco endereco2 = new Endereco("Rua do sol 1", "Maracanáu", 61950070);
	Cliente cliente2 = new Cliente(endereco2, "Sam", 17, 'F');
	Caixa caixa2 = new Caixa(35.89, 500,6);
	Biblioteca biblioteca2 = new Biblioteca(endereco2, cliente2, caixa2, "Percy jackson");
	
	biblioteca2.setEndereco(endereco2);
	biblioteca2.setCliente(cliente2);
	biblioteca2.setCaixa(caixa2);
	
	biblioteca2.calcularTroco();
	biblioteca2.resultShow();
	
	
	
	
	}
	
}
