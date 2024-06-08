package minhaUniversidade;

import java.util.ArrayList;
import java.util.List;
public class Turma {
	private int codigo;
	private String nome;
	private Disciplina disciplina;
	private Professor professor;
	private List<Aluno> alunos;
	
	
	public Turma(int codigo, String nome, Disciplina disciplina, Professor professor) {
	this.codigo = codigo;
	this.nome = nome;
	this.disciplina = disciplina;
	this.professor = professor;
	this.alunos = new ArrayList<>();
}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
	this.codigo=codigo;
		}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome=nome;
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor=professor;
	}
	public List<Aluno> getAlunos(){
		return alunos;
	}
	public void adicionarAluno(Aluno aluno) {
		this.alunos.add(aluno);
	}
	public void removerAluno(Aluno aluno) {
		this.alunos.remove(aluno);
	}
	public void mostrarInformaçoes() {
		System.out.println("Turma" + nome + "(Código: " + codigo + ")");
		System.out.println("Disciplina: " + disciplina.getNome());
		System.out.println("Professor: " + professor.getNome());
		System.out.println("Alunos:");
		for (Aluno aluno : alunos) {
			System.out.println(" - " + aluno.getNome());
		}
	}
		public void listarAlunos() {
			System.out.println("Alunos matriculados na turma:");
			for (Aluno aluno : alunos) {
				System.out.println(aluno.getNome());
			}
		
	}
}

