package exercicio17._1;

public class Cliente {
	
	private String nome;
	private String sexo;
	private int idade;
	private float saldo;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public void status() {
		System.out.println("NOME: " + this.nome);
		System.out.println("SEXO: " + this.sexo);
		System.out.println("IDADE: " + this.idade);
		System.out.println("SALDO: R$ " + this.saldo);
	}
	
	public void comprar(int valor) {
		System.out.print(this.nome + " tinha R$ " + this.saldo);
		this.saldo -= valor;
		System.out.println(" na conta e fez uma compra de R$ " + valor + ".\nSaldo atual: R$ " + this.saldo);
	}
	
	public void fazerAniversario() {
		this.idade++;
	}
	
}
