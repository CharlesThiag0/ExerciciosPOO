package vendaDeCarro;

public class DadosCompra {
	private Cliente cliente;
	private Carro carro;
	
	public DadosCompra (Cliente cliente, Carro carro) {
		this.cliente = cliente;
		this.carro = carro;
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}
	
	public Carro getCarro() {
		return this.carro;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	
	public void resultShow () {
		System.out.printf("Cliente : %s, CPF : %s, Idade : %d%n",
				this.cliente.getNome(), this.cliente.getCpf(), this.cliente.getIdade());
	}
	
}
