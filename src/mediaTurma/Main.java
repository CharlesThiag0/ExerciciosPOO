package mediaTurma;

public class Main {
	public static void main(String[] args) {
		//criar obj
		Turma turma1 = new Turma();
		
		Aluno aluno = new Aluno("Charles", 131313, 7.5, 8.0);
		Disciplina disciplina = new Disciplina("POO", "Paulo", 5);
		Curso curso = new Curso("Java", 9999);
		
		//compossição de obj
		turma1.setAluno(aluno);
		turma1.setDisciplina(disciplina);
		turma1.setCurso(curso);
	
		turma1.resultShow();//saida
		
	}
}
