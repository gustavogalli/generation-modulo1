package exercicio18._7;

public class Main {

	public static void main(String[] args) {
		
		Paciente p1 = new Paciente();
		
		p1.setNome("Kelly Dolores");
		p1.setIdade(23);
		p1.setDoenca("Perna quebrada");
		p1.setDolorido(true);
		
		p1.status();
		
		p1.internar();
		p1.medicar();
		
		p1.status();
		
		p1.darAlta();
		
		p1.status();
	}
}