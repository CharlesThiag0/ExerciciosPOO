package livraria;

public class Biblioteca {
	private Endereco endereco;
	private Cliente cliente;
	private Caixa caixa;
	private String livro;
	private int anoDeLancamento;
	
	public Biblioteca (Endereco endereco, Cliente cliente, Caixa caixa, String livro, int anoDeLancamento) {
		this.endereco = endereco;
		this.cliente = cliente;
		this.caixa = caixa;
		this.livro = livro;
		this.anoDeLancamento = anoDeLancamento;
	}

	public Endereco getEndereco() {
		return this.endereco;
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}
	
	public Caixa getCaixa() {
		return this.caixa;
	}

	public String getLivro() {
		return this.livro;
	}
	
	public int getAnoDeLancamento() {
		return this.anoDeLancamento;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void setCaixa(Caixa caixa) {
		this.caixa = caixa;
	}
	
	public void setLivro(String livro) {
		this.livro = livro;
	}
	
	public void setAnoDeLancamento(int anoDeLancamento) {
		this.anoDeLancamento = anoDeLancamento;
	}
	
	public double valorTotal() {
		return this.caixa.getPreco() * this.caixa.getQuantiadade();
	}
	
	public double calcularTroco() {
		double livrosTotal =0;
		livrosTotal += this.caixa.getPreco() * this.caixa.getQuantiadade();
		return this.caixa.getTroco() - livrosTotal;
	}
	
	public void resultShow() {
		System.out.printf("Cliente %s, com %d anos, genero %c%n",
				this.cliente.getNome(), this.cliente.getIdade(), this.cliente.getGenero());
		System.out.printf("O livro %s esta com o preço de %.2f, quantidade %.0f data de lancamento %d%n",
				this.livro, this.caixa.getPreco(), this.caixa.getQuantiadade(), this.anoDeLancamento );
		System.out.printf("Preço total : %.2f%n",this.valorTotal());
		System.out.printf("Valor recebi de : %.2f, Troco de : %.2f%n",
				this.caixa.getTroco(), calcularTroco());
		System.out.println("----------------------------------------------");
		System.out.printf("Entrega para a %s em %s, cep : %d%n",
				this.endereco.getRua(), this.endereco.getCidade(), this.endereco.getCep());
		
	}
}
