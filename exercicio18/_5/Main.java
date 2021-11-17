package exercicio18._5;

public class Main {

	public static void main(String[] args) {
		
		Patinete p1 = new Patinete();
		
		p1.setMarca("Kids Grama");
		p1.setModelo("Só rodinhas");
		p1.setMaterial("Aço");
		p1.setVelocidade(10);
		p1.setPreco(149.99f);
		p1.setAro(10);
		
		p1.acelerar(10);
		p1.acelerar(15);
		
		p1.fazerDrift();
		p1.frear(20);
		p1.frear(20);
		
		p1.status();
		
	}
}