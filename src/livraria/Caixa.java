package livraria;

public class Caixa {
	private double preco;
	private double troco;
	private double quantiadade;
	
	public Caixa (double preco, double troco, double quantidade) {
		this.preco = preco;
		this.troco = troco;
		this.quantiadade = quantidade;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	public double getTroco() {
		return this.troco;
	}
	
	public double getQuantiadade() {
		return this.quantiadade;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void setTroco(double troco) {
		this.troco = troco;
	}
	
	public void setQuantiadade(double quantiadade) {
		this.quantiadade = quantiadade;
	}
	
}
