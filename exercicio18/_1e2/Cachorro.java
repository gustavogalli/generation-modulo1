package exercicio18._1e2;

public class Cachorro extends Animal {
	
	public void emitirSom() {
		System.out.println("Au au au!");
	}
	
	public void locomover() {
		this.correr();
	}
	
	public void correr() {
		System.out.println("Cachorro " + this.getNome() + " está correndo por aí!");
	}

}
