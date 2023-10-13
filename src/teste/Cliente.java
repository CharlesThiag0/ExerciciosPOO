package teste;

public class Cliente {
	private String cpf;
	private String nome;
	private String profissao;
	
	//getters
	public String getCpf() {
		return this.cpf;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getProfissao() {
		return this.profissao;
	}
	
	//setters
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
}
