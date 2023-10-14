package mediaTurma;

public class Curso {
	//curso - nomedocurso codigo
	private String nomeDoCurso;
	private int codigoDoCurso;
	
	//construtor
	public Curso (String nomeDoCurso, int codigoDoCurso) {
		this.nomeDoCurso = nomeDoCurso;
		this.codigoDoCurso = codigoDoCurso;
	}
	
	//getters
	public String getNomeDoCurso() {
		return this.nomeDoCurso;
	}
	
	public int getCodigoDoCurso() {
		return this.codigoDoCurso;
	}
	
	//setters
	public void setNomeDoCurso(String nomeDoCurso) {
		this.nomeDoCurso = nomeDoCurso;
	}
	
	public void setCodigoDoCurso(int codigoDoCurso) {
		this.codigoDoCurso = codigoDoCurso;
	}
	
}
