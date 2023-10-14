package mediaTurma;

public class Aluno {
	//nome matricula nota1 nota2
	private String nome;
	private int matricula;
	private double nota1;
	private double nota2;
	
	//construtor
	public Aluno (String nome, int matricula ,double nota1 ,double nota2) {
		this.nome = nome;
		this.matricula = matricula;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	//getters
	public String getNome() {
		return this.nome;
	}
	
	public int getMatricula() {
		return this.matricula;
	}
	
	public double getNota1() {
		return this.nota1;
	}
	
	public double getNota2() {
		return this.nota2;
	}
	
	
	//setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	
	
}	
