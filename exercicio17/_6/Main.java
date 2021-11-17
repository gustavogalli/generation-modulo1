package exercicio17._6;

public class Main {

	public static void main(String[] args) {
		
		ContaBancaria c1 = new ContaBancaria();

		c1.setProprietario("Silvio Santos");
		c1.setBanco("Itaú");
		c1.setAgencia(3948);
		c1.setConta(124532);
		c1.setSaldo(100f);
		
		c1.abrirConta();
		c1.depositar(100f);
		c1.sacar(50f);
		
		c1.mudarParaPoupanca();
		c1.status();
		
		c1.sacar(150f);
		c1.fecharConta();
		
		c1.status();
	}
}