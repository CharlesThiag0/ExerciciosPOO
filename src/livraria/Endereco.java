package livraria;

public class Endereco {
	private String rua;
	private String cidade;
	private int cep;
	
	public Endereco (String rua, String cidade, int cep) {
		this.rua = rua;
		this.cidade = cidade;
		this.cep = cep;
	}
	
 	public String getRua() {
		return this.rua;
	}
	
	public String getCidade() {
		return this.cidade;
	}
	
	public int getCep() {
		return this.cep;
	}
	
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public void setCep(int cep) {
		this.cep = cep;
	}
	
}
