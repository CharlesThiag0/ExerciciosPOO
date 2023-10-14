package LojaPedidos;

public class ItemPedidos {
	//nome,preco,quantidade
	private String nomeDoPedido;
	private double precoDoPedido;
	private int quantidadeDoPedido;
	
	public ItemPedidos (String nomeDoPedido, double precoDoPedido, int quantidadeDoPedido) {
		this.nomeDoPedido = nomeDoPedido;
		this.precoDoPedido = precoDoPedido;
		this.quantidadeDoPedido = quantidadeDoPedido;
	}
	
	public String getNomeDoPedido() {
		return this.nomeDoPedido;
	}
	
	public double getPrecoDoPedido() {
		return this.precoDoPedido;
	}
	
	public int getQuantidadeDoPedido() {
		return this.quantidadeDoPedido;
	}
	
	public void setNomeDoPedido(String nomeDoPedido) {
		this.nomeDoPedido = nomeDoPedido;
	}
	
	public void setPrecoDoPedido(double precoDoPedido) {
		this.precoDoPedido = precoDoPedido;
	}
	
	public void setQuantidadeDoPedido(int quantidadeDoPedido) {
		this.quantidadeDoPedido = quantidadeDoPedido;
	}
	
}
