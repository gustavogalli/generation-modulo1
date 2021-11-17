package exercicio18._1e2;

public class Main {

	public static void main(String[] args) {
		
		Cachorro c1 = new Cachorro();
		
		c1.setNome("Rex");
		c1.setIdade(2);
		
		c1.emitirSom();
		c1.locomover();
		
		System.out.println("-------------------------------------");
		
		Cavalo c2 = new Cavalo();
		c2.setNome("Eguinha");
		c2.setIdade(12);
		
		c2.emitirSom();
		c2.locomover();
		
		System.out.println("-------------------------------------");
		
		Preguiça p1 = new Preguiça();
		p1.setNome("Gustavo");
		p1.setIdade(20);
		
		p1.emitirSom();
		p1.locomover();
		
	}
}