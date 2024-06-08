package minhaUniversidade;

public class Main {

	public static void main(String[] args) {
		//Instanciando disciplinas
		Disciplina disciplina1 = new Disciplina(101, "Matemática", 1);
		Disciplina disciplina2 = new Disciplina(102, "História", 2);
		Disciplina disciplina3 = new Disciplina(103, "Física", 3);
		
		//Instância alunos
		Aluno aluno1 = new Aluno(1234567, "João", 18, 12345);
		Aluno aluno2 = new Aluno(87654321, "Maria", 19, 54321);
		Bolsista bolsista1 = new Bolsista(7894561, "Mario", 20, 12321);
		
		//Instanciando professor
		Professor professor1 = new Professor(423467, "Adriano", 57, "Matemática");
		
		//Instanciando visitantes
		Visitante visitante1 = new Visitante(281890, "Jacinto Pinto", 30, "14/07/2025");
		Visitante visitante2 = new Visitante(784435, "Bebel Leite", 40, "18/12/2026");
		
		//Instanciando Turmas
		Turma turma1 = new Turma(105, "A", disciplina1, professor1);
		turma1.adicionarAluno(aluno1);
		turma1.adicionarAluno(aluno2);
		
		Turma turma2 = new Turma(106, "B", disciplina2, professor1);
		turma2.adicionarAluno(aluno2);
		turma2.adicionarAluno(bolsista1);
		
		Turma turma3 = new Turma(107, "C", disciplina3, professor1);
		turma3.adicionarAluno(bolsista1);
		turma3.adicionarAluno(aluno2);
		turma3.adicionarAluno(aluno1);
		
		//Imprimindo informações das turmas
		System.out.println("Informações das Turmas:");
		turma1.mostrarInformaçoes();
		turma2.mostrarInformaçoes();
		turma3.mostrarInformaçoes();
	}

}
