package teste3;

public class Disciplina {
	//nomedadisciplina professor cargahoraria
	private String nomeDaDisciplina;
	private String professor;
	private int cargaHoraria;
	
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
