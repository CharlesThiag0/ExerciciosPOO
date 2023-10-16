package vendaDeCarro;

public class DadosCompra {
	private Cliente cliente;
	private Carro carro;

	public DadosCompra(Cliente cliente, Carro carro) {
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

	public void cupomDeDesconto(int cupom) {
		double valorDesconto = 0;
		if (cupom == 121212) {
			valorDesconto += this.carro.getValor() * 0.05;
			this.carro.setDesconto(valorDesconto);
		}
		
	}
	
	public void resultShow() {
		System.out.printf("Cliente : %s, CPF : %s, Idade : %d%n", this.cliente.getNome(), this.cliente.getCpf(),
				this.cliente.getIdade());
		System.out.printf("Marca %s modelo %s do ano %d está por apenas %.2f%n", this.carro.getMarca(),
				this.carro.getModelo(), this.carro.getAno(), this.carro.getValor());
			if(this.carro.getDesconto() > 0) {
				System.out.printf("Desconto de %.2f%n", this.carro.getDesconto());
			}
	}

}
