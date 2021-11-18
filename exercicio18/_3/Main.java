package exercicio18._3;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		List<String> estoque = new ArrayList<>();
		
		estoque.add("Camiseta");
		estoque.add("Calça");
		estoque.add("Bermuda");
		estoque.add("Boné");
		estoque.add("Vestido");
		estoque.add("Tênis");
		estoque.add("Sandália");
		estoque.add("Chinelo");
		estoque.add("Sapatilha");
		
		estoque.remove("Sapatilha");
		
		estoque.set(estoque.indexOf("Chinelo"), "Chinelas");
		
		System.out.println(estoque.toString());
		
	}
}