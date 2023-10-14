package mediaTurma;

public class Disciplina {
	//nomedadisciplina professor cargahoraria
	private String nomeDaDisciplina;
	private String professor;
	private int cargaHoraria;
	
	//construtor
	public Disciplina (String nomeDaDisciplina, String professor, int cargaHoraria) {
		this.nomeDaDisciplina = nomeDaDisciplina;
		this.professor = professor;
		this.cargaHoraria = cargaHoraria;
	}
	
	//getters
	public String getNomeDaDisciplina() {
		return this.nomeDaDisciplina;
	}
	
	public String getProfessor() {
		return this.professor;
	}
	
	public int getCargaHoraria() {
		return this.cargaHoraria;
	}
	
	//setters
	public void setNomeDaDisciplina(String nomeDaDisciplina) {
		this.nomeDaDisciplina = nomeDaDisciplina;
	}
	
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

}
