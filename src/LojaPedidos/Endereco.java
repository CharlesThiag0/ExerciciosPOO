package LojaPedidos;

public class Endereco {
	private String endereco;
	private int numeroDaCasa;
	private String cidade;
	
	public Endereco(String endereco, int numeroDaCasa, String cidade) {
		this.endereco = endereco;
		this.numeroDaCasa = numeroDaCasa;
		this.cidade = cidade;
	}
	
	public String getEndereco() {
		return this.endereco;
	}
	
	public int getNumeroDaCasa() {
		return this.numeroDaCasa;
	}
	
	public String getCidade() {
		return this.cidade;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void setNumeroDaCasa(int numeroDaCasa) {
		this.numeroDaCasa = numeroDaCasa;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

}
