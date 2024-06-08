package minhaUniversidade;

public class Bolsista extends Aluno{
	
	public Bolsista (int cpf, String nome, int idade, int matricula) {
		super(cpf, nome, idade, matricula);
	}
	@Override
	public void pagarMensalidade() {
		System.out.println("Bolsistas não precisar pagar mensalidade.");
	}

}
