package teste3;

public class Turma {
	//aluno,disciplina,curso
	 private Aluno aluno;
	 private Disciplina disciplina;
	 private Curso curso;
	
	 //desafio construtores
	 
	 
	//getters
	public Aluno getAluno() {
		return this.aluno;
	}
	
	public Disciplina getDisciplina() {
		return this.disciplina;
	}
	
	public Curso getCurso() {
		return this.curso;
	}
	
	//setters
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	
	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	//calcular a media
	public double calcularMedia() {
		double nota1 = aluno.getNota1();
		double nota2 = aluno.getNota2();
		return (nota1 + nota2) / 2;
	}
	
	//metudo saida
	public void resultShow () {
		System.out.printf("O Aluno: %s, com a matricula de numero %d%n 1- %.2f, 2- %.2f, Media : %.2f%n",
				aluno.getNome() ,aluno.getMatricula() ,aluno.getNota1() ,aluno.getNota2() ,calcularMedia());
		System.out.printf("Disciplina : %s com o professor %s e total de %d HorasAulas%n",
				disciplina.getNomeDaDisciplina() ,disciplina.getProfessor() ,disciplina.getCargaHoraria());
		System.out.printf("Codigo do curso de %s : %d",
				curso.getNomeDoCurso() ,curso.getCodigoDoCurso());
		
	}
	
}
