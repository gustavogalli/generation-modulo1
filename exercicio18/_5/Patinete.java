package exercicio18._5;

public class Patinete {

	private String marca;
	private String modelo;
	private String material;
	private float preco;
	private int aro;
	private int velocidade;
	private boolean movimento;

	public void status() {
		System.out.println("\nMARCA: " + this.marca);
		System.out.println("MODELO: " + this.modelo);
		System.out.println("MATERIAL: " + this.material);
		System.out.println("VELOCIDADE ATUAL: " + this.velocidade + " km/h");
		System.out.println("PREÇO: R$ " + this.preco);
		System.out.println("ARO: " + this.aro);
		System.out.println("EM MOVIMENTO? " + this.movimento);
	}

	public void acelerar(int km) {
		this.setVelocidade(getVelocidade() + km);
		System.out.println("Acelerando!!!");
		this.setMovimento(true);
	}

	public void frear(int km) {
		if (getVelocidade() < 0) {
			System.out.println("Patinete está parado, não é possível frear.");
		} else {
			if(this.velocidade - km < 0) {
				this.velocidade = 0;
				this.movimento = false;
			} else {
				this.velocidade -= km;
				System.out.println("Desacelerando...");
				this.movimento = false;
			}
		}
	}

	public void parar() {
		this.movimento = false;
		this.setVelocidade(0);
		System.out.println("Parando...");
	}

	public void fazerDrift() {
		System.out.println("Rrrrrrrrrrrrrgh.......");
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getAro() {
		return aro;
	}

	public void setAro(int aro) {
		this.aro = aro;
	}

	public boolean isMovimento() {
		return movimento;
	}

	public void setMovimento(boolean movimento) {
		this.movimento = movimento;
	}

}
