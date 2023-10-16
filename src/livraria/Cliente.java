package livraria;

public class Cliente {
	private Endereco endereco;
	private String nome;
	private int idade;
	private char genero;
	
	public Cliente (Endereco endereco, String nome, int idade, char genero) {
		this.endereco = endereco;
		this.nome = nome;
		this.idade = idade;
		this.genero = genero;
	}
	
	public Endereco getEndereco() {
		return this.endereco;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public char getGenero() {
		return this.genero;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setGenero(char genero) {
		this.genero = genero;
	}
	
}
