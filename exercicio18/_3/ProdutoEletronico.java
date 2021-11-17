package exercicio18._3;

public class ProdutoEletronico {

	private String nome;
	private String marca;
	private String descricao;
	private String cor;
	private int carga;
	private float preco;
	private float peso;
	private boolean ligado;

	public void ligar() {
		if (this.ligado) {
			System.out.println("Erro! Já está ligado!");
		} else {
			this.ligado = true;
			System.out.println("Produto ligado com sucesso!");
		}
	}

	public void desligar() {
		if (this.ligado == false) {
			System.out.println("Erro! Já está desligado!");
		} else {
			this.ligado = false;
			System.out.println("Produto desligado com sucesso!");
		}
	}

	public void recarregar() {
		if (this.carga == 100) {
			System.out.println("Erro! Já está totalmente carregado!");
		} else {
			System.out.println("Carregando...");
			this.carga = 100;
		}
	}

	public void status() {
		System.out.println("NOME: " + this.nome);
		System.out.println("MARCA: " + this.marca);
		System.out.println("DESCRIÇÃO: " + this.descricao);
		System.out.println("COR: " + this.cor);
		System.out.println("CARGA: " + this.carga + "%");
		System.out.println("PREÇO: R$ " + this.preco);
		System.out.println("PESO: " + this.peso + "g");
		System.out.println("LIGADO? " + this.ligado);
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

}
