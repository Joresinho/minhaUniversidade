package minhaUniversidade;

public class Professor extends Pessoa {
	private String centro;
	
	public Professor (int cpf, String nome, int idade, String centro) {
		super(cpf, nome, idade);
		this.centro = centro;
	}
	public String getCentro() {
		return centro;
	}
	public void setCentro(String centro) {
		this.centro = centro;
	}
	public void darAula() {
		System.out.println("O professor" + getNome() + "está dando aula no centro" + centro);
	}
@Override
	public void pagarMensalidade() {
	System.out.println("O professor não precisa pagar mensalidade!");
}
@Override
public void mostrarInformaçoes () {
	System.out.println("O professor" + getNome() + "está dando aula no centro " + centro);
}
}
