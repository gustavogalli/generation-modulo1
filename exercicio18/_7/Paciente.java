package exercicio18._7;

public class Paciente {

	private String nome;
	private String doenca;
	private int idade;
	private boolean internado;
	private boolean dolorido;
	
	public void status() {
		System.out.println("\nPACIENTE: " + this.nome);
		System.out.println("IDADE: " + this.idade);
		System.out.println("DOENÇA: " + this.doenca);
		System.out.println("INTERNADO? " + this.internado);
		System.out.println("COM DORES? " + this.dolorido);
	}
	
	public void medicar() {
		if(this.dolorido) {
			this.dolorido = false;
			System.out.println("Medicando...");
		} else {
			System.out.println("O paciente não sente dores.");
		}
	}
	
	public void internar() {
		if(this.internado == false) {
			this.internado = true;
			System.out.println("Internando já!");
		} else {
			System.out.println("Paciente já está internado.");
		}
	}
	
	public void darAlta() {
		if(this.dolorido == false && this.internado) {
			System.out.println("Notícia boa! Você teve alta, " + this.nome + "!");
			this.doenca = "Nenhuma!";
			this.internado = false;
		} else {
			System.out.println("Paciente ainda em tratamento...");
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDoenca() {
		return doenca;
	}

	public void setDoenca(String doenca) {
		this.doenca = doenca;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean isInternado() {
		return internado;
	}

	public void setInternado(boolean internado) {
		this.internado = internado;
	}

	public boolean isDolorido() {
		return dolorido;
	}

	public void setDolorido(boolean dolorido) {
		this.dolorido = dolorido;
	}

}
