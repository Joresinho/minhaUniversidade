package minhaUniversidade;

public class Regular extends Aluno{
	public double mensalidade;
	
	public Regular(int cpf, String nome, int idade, int matricula, double mensalidade) {
	super(cpf, nome, idade, matricula);
	this.mensalidade = mensalidade;			
	}
	public double getMensalidade() {
		return mensalidade;
	}
	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}
	@Override
	public void pagarMensalidade() {
		System.out.println("Alunos regulares precisam pagar mensalidade. O valor é de:" + mensalidade);
	}
	}
