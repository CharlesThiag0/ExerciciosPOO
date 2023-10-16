package petShop;

public class PetShop {
	private Especie especie;
	private Animais animais;
	private Racao racao;
	private Caixa caixa;
	
	public PetShop (Especie especie, Animais animais, Racao racao, Caixa caixa) {
		this.especie = especie;
		this.animais = animais;
		this.racao = racao;
		this.caixa = caixa;
	}
	
	public Especie getEspecie() {
		return this.especie;
	}
	
	public Animais getAnimais() {
		return this.animais;
	}
	
	public Racao getRacao() {
		return this.racao;
	}
	
	public void setEspecie(Especie especie) {
		this.especie = especie;
	}
	
	public void setAnimais(Animais animais) {
		this.animais = animais;
	}
	
	public void setRacao(Racao racao) {
		this.racao = racao;
	}
	
	public void setCaixa(Caixa caixa) {
		this.caixa = caixa;
	}
	
	
	public Caixa getCaixa() {
		return this.caixa;
	}
	
	//metudo saida
	public void resultShow() {
		System.out.printf("Animal %s, com %d anos, raça é %s com o peso %.2f kg nasceu em %s%n",
				this.especie.getNome(), this.especie.getIdade(), this.especie.getRaca(), this.especie.getPeso(), this.animais.getDataDeNascimento());
		System.out.printf("Preco da ração por kg : %.2f%nQuantidade escolhida de %.2fkg%nTotal de : %.2f%nDinheiro recebi : %.2f valor de troco %.2f%n",
				this.racao.getPrecoRacao(), this.racao.getQuantidadePorKg(),  this.caixa.calcularKg(),this.caixa.getDinheiroRecebido(), this.caixa.calcularTroco());
	}
	
}
