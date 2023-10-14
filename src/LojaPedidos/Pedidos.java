package LojaPedidos;

public class Pedidos {
	private Endereco endereco;
	private Cliente cliente;
	private ItemPedidos itemPedidos;
	
	public Pedidos (Endereco endereco, Cliente cliente, ItemPedidos itemPedido) {
		this.endereco = endereco;
		this.cliente = cliente;
		this.itemPedidos = itemPedido;
		}
	
	public Endereco getEndereco() {
		return this.endereco;
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}
	
	public ItemPedidos getItemPedidos() {
		return this.itemPedidos;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void setItemPedidos(ItemPedidos itemPedidos) {
		this.itemPedidos = itemPedidos;
	}
	
	public double calculoValorTotal () {
		return this.itemPedidos.getPrecoDoPedido() * this.itemPedidos.getQuantidadeDoPedido();
	}

	public void resultShow () {
		System.out.printf("Pedido : %s de %.2f quantidades : %d%n",
				this.itemPedidos.getNomeDoPedido(), this.itemPedidos.getPrecoDoPedido(), this.itemPedidos.getQuantidadeDoPedido() );
		System.out.printf("Cliente : %s%nCPF : %s%nEndereço : %s , %d - %s%n",
				this.cliente.getNome(), this.cliente.getCpf(), 
				this.endereco.getEndereco(), this.endereco.getNumeroDaCasa(),this.endereco.getCidade());
	}
	
}
