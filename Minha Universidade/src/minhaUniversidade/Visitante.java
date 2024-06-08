package minhaUniversidade;

public class Visitante extends Pessoa {
private String dataVisita;

public Visitante (int cpf, String nome, int idade, String dataVisita) {
	super(cpf, nome, idade);
	this.dataVisita = dataVisita;
}
	public String getDataVisita() {
		return dataVisita;
	}
	public void setDataVisita(String dataVisita) {
		System.out.println("CPF:" + getCpf());
		System.out.println("Nome:" + getNome());
		System.out.println("Idade:" + getIdade() + "anos.");
		this.dataVisita = dataVisita;
	}
	public void mostrarInformaçoes() {
		System.out.println("CPF:" + getCpf());
		System.out.println("Nome:" + getNome());
		System.out.println("Idade:" + getIdade() + "anos.");
		System.out.println("Data da Visita:" + getDataVisita());
	}
	@Override
	public void pagarMensalidade() {
		System.out.println("Visitante não paga mensalidade!");
		
	}
	}
