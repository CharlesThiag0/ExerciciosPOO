package LojaPedidos;

public class Main {
	public static void main(String[] args) {
		Endereco endereco1 = new Endereco("Rua das palmas", 389, "Fortaleza");
		Cliente cliente1 = new Cliente("Charles", "333.333.333-33", endereco1);
		ItemPedidos itemPedidos1 = new ItemPedidos("Hot-Dog", 6.00, 2);
		
		Pedidos pedidos1 = new Pedidos(endereco1, cliente1, itemPedidos1);
		
		pedidos1.setEndereco(endereco1);
		pedidos1.setCliente(cliente1);
		pedidos1.setItemPedidos(itemPedidos1);
		
		pedidos1.resultShow();
		
		System.out.printf("TOTAL : R$%.2f%n",pedidos1.calculoValorTotal());	
		
	}
}
