package vendaDeCarro;

public class Cliente {
	private String nome;
	private String cpf;
	private int idade;
	
	//construtor
	public Cliente (String nome, String cpf, int idade) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
	}
	
	public String getNome () {
		return this.nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void seNome(String nome) {
		this.nome = nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
