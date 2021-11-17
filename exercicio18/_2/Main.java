package exercicio18._2;

public class Main {
	public static void main(String[] args) {
		
		Aviao a1 = new Aviao();
		
		a1.setFabricante("Boeing");
		a1.setModelo("787");
		a1.setCapacidadePassageiros(350);
		
		a1.abastecer();
		
		a1.status();
		
		a1.ligar();
		a1.decolar();
		a1.voar();
		a1.voar();
		a1.voar();
		a1.pousar();
		
		a1.status();
		
		Aviao a2 = new Aviao();
		a2.setFabricante("Boeing");
		a2.setModelo("727");
		a2.setCapacidadePassageiros(280);
		
		a2.abastecer();
		
		a2.status();
		
		a2.ligar();
		a2.ligar();
		a2.abastecer();
		a2.decolar();
		a2.voar();
		a2.voar();
		a2.voar();
		a2.voar();
		a2.voar();
		a2.voar();
		a2.pousar();

		a2.status();
	}
}
