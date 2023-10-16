package petShop;

public class Animais {
	private Especie especie;
	private String dataDeNascimento;
	
	public Animais (Especie especie,String dataDeNascimento) {
		this.especie = especie;
		this.dataDeNascimento = dataDeNascimento;
	}
	
	public Especie getEspecie() {
		return this.especie;
	}
	
	public String getDataDeNascimento() {
		return this.dataDeNascimento;
	}
	
}
