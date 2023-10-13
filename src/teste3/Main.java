package teste3;

public class Main {
	public static void main(String[] args) {
		//criar obj
		Turma turma1 = new Turma();
		
		Aluno aluno = new Aluno();
		Disciplina disciplina = new Disciplina();
		Curso curso = new Curso();
		
		turma1.setAluno(aluno);//compossição de obj
		
		turma1.getAluno().setNome("Charles");
		turma1.getAluno().setMatricula(141414);
		turma1.getAluno().setNota1(9.0);
		turma1.getAluno().setNota2(7.5);
		
		turma1.setDisciplina(disciplina);//compossição de obj
		turma1.getDisciplina().setNomeDaDisciplina("POO");
		turma1.getDisciplina().setProfessor("Paulo");
		turma1.getDisciplina().setCargaHoraria(5);
		
		turma1.setCurso(curso);//compossição de obj
		turma1.getCurso().setNomeDoCurso("Java");
		turma1.getCurso().setCodigoDoCurso(2222);
		
		turma1.resultShow();//saida
		
	}
}
