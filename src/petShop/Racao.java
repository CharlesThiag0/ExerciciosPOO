package petShop;

public class Racao {
	private double precoRacao;
	private double quantidadePorKg;
	
	public Racao (double precoRacao, double quantidadePorKg) {
		this.precoRacao = precoRacao;
		this.quantidadePorKg = quantidadePorKg;
	}
	
	public double getPrecoRacao() {
		return this.precoRacao;
	}
	
	public double getQuantidadePorKg() {
		return this.quantidadePorKg;
	}
	
}
