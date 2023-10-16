package petShop;

public class Caixa {
	private Racao racao;
	private double dinheiroRecebido;
	
	public Caixa (Racao racao, double dinheiroRecebido) {
		this.racao = racao;
		this.dinheiroRecebido = dinheiroRecebido;
	}
	
	public Racao getRacao() {
		return this.racao;
	}
	
	public double getDinheiroRecebido() {
		return this.dinheiroRecebido;
	}
	
	public double calcularKg () { 
		return ((this.racao.getPrecoRacao() * 1000) / this.racao.getQuantidadePorKg());
	}
	
	//metudo para troco
	public double calcularTroco() {
		return this.dinheiroRecebido - this.calcularKg();
	}
	
}
