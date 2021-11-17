package exercicio18._2;

public class Aviao {

	private String modelo;
	private String fabricante;
	private int capacidadePassageiros;
	private float quantidadeCombustivel;
	private boolean ligado;
	private boolean voando;

	public void status() {
		System.out.println("\n----------- AVIÃO ----------");
		System.out.println(this.fabricante + " - " + this.modelo);
		System.out.println("CAPACIDADE: " + this.capacidadePassageiros + " passageiros");
		System.out.println("LIGADO? " + this.ligado);
		System.out.println("VOANDO? " + this.voando);
		System.out.println(this.quantidadeCombustivel + "% de combustível");
		System.out.println();
	}

	public void ligar() {
		if (this.ligado) {
			System.out.println("ERRO! Avião já está ligado!");
		} else {
			this.setLigado(true);
			System.out.println("Ligando avião...");
		}
	}

	public void desligar() {
		if (this.ligado == false) {
			System.out.println("ERRO! Avião já está desligado!");
		} else if (this.voando) {
			System.out.println("ERRO! Avião está nos ares!");
		} else {
			this.setLigado(false);
			System.out.println("Desligando avião...");
		}
	}

	public void decolar() {
		if (this.ligado && this.voando == false && this.quantidadeCombustivel > 50) {
			this.setVoando(true);
			System.out.println("Apertem os cintos! Estamos decolando!");
		} else {
			System.out.println("Não é possível decolar!");
			System.out.println("Avião desligado ou está no ar, ou pouca quantidade de combustível!");
		}
	}
	
	public void voar() {
		System.out.println("Estamos voando... Usamos 10% do combustível...");
		this.setQuantidadeCombustivel(getQuantidadeCombustivel() - 10); 
	}

	public void pousar() {
		if (this.voando) {
			System.out.println("Aterrissando...");
			this.setVoando(false);
		}
	}

	public void abastecer() {
		if (this.getQuantidadeCombustivel() == 100) {
			System.out.println("Erro! O avião está com o tanque cheio.");
		} else {
			this.setQuantidadeCombustivel(100);
		}
	}
	

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public int getCapacidadePassageiros() {
		return capacidadePassageiros;
	}

	public void setCapacidadePassageiros(int capacidadePassageiros) {
		this.capacidadePassageiros = capacidadePassageiros;
	}

	public float getQuantidadeCombustivel() {
		return quantidadeCombustivel;
	}

	public void setQuantidadeCombustivel(float quantidadeCombustivel) {
		this.quantidadeCombustivel = quantidadeCombustivel;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public boolean isVoando() {
		return voando;
	}

	public void setVoando(boolean voando) {
		this.voando = voando;
	}

}
