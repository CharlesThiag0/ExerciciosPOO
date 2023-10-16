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
	
	
	}
	
}
