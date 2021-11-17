package exercicio18._1;

public class Main {
	public static void main(String[] args) {
		
		Cliente c1 = new Cliente();
		
		c1.setNome("Josefino");
		c1.setSaldo(1000);
		c1.setIdade(50);
		c1.setSexo("M");
		
		c1.comprar(30);
		c1.comprar(100);
		
		Cliente c2 = new Cliente();
		
		c2.setNome("Marieta");
		c2.setSaldo(350);
		c2.setIdade(35);
		c2.setSexo("F");
		
		c2.comprar(100);
		c2.fazerAniversario();
		
	}
}