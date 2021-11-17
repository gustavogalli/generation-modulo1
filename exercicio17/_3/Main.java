package exercicio17._3;

public class Main {

	public static void main(String[] args) {

		ProdutoEletronico p1 = new ProdutoEletronico();

		p1.setNome("Notebook");
		p1.setMarca("Dell");
		p1.setCor("Preto");
		p1.setPreco(2500f);
		p1.setCarga(85);
		p1.setDescricao("64GB de RAM | Processador i7 | Linux Mint");
		p1.setLigado(false);
		p1.setPeso(1785);
		
		p1.ligar();

		p1.status();

		System.out.println("---------------------------------");

		ProdutoEletronico p2 = new ProdutoEletronico();

		p2.setNome("Celular");
		p2.setMarca("LG");
		p2.setCor("Prata");
		p2.setPreco(600f);
		p2.setCarga(56);
		p2.setDescricao("Android 10 | Cristal Líquido ");
		p2.setLigado(false);
		p2.setPeso(1785);
		
		p2.recarregar();
		p2.desligar();

		p2.status();

	}
}