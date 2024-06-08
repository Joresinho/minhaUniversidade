package minhaUniversidade;

public class Aluno extends Pessoa {
	public int matricula;
	
	public Aluno (int cpf, String nome, int idade, int matricula) {
		super(cpf, nome, idade);													
        this.matricula = matricula;
	}
	public int getMatricula(){
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	@Override
	public void pagarMensalidade() {
		System.out.println("Precisa pagar a mensalidade!");
	}
	@Override
	public void mostrarInformaçoes() {
		System.out.println("CPF:" + getCpf());
		System.out.println("Nome:" + getNome());
		System.out.println("Idade:" + getIdade() + "anos.");
		System.out.println("Matrícula: " + getMatricula());
	}
	}
