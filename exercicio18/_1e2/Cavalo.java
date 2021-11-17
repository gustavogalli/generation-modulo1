package exercicio18._1e2;

public class Cavalo extends Animal {
	
	public void emitirSom() {
		System.out.println("Rión rión rión! (som de cavalo)");
	}
	
	public void locomover() {
		this.correr();
	}
	
	public void correr() {
		System.out.println("Cavalo " + this.getNome() + " está fazendo pocotó pocotó pocotó!");
	}

}
