package exercicio18._1e2;

public class Preguiça extends Animal {
	
	public void emitirSom() {
		System.out.println("Ugh ugh ugh (som de preguiça)");
	}
	
	public void locomover() {
		subirEmArvores();
	}
	
	public void subirEmArvores() {
		System.out.println("Preguiça " + this.getNome() + " está subindo em uma árvore.");
	}

}
