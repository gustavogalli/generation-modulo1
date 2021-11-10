package exercicio12;

import java.util.Scanner;

public class Exercicio12_8 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double custoFabrica, percDistribuidor = 0.28, percImpostos = 0.45, custoConsumidor, valorDistribuidor, valorImpostos;
		
		System.out.print("Digite o custo de fábrica: R$ ");
		custoFabrica = in.nextDouble();
		
		valorDistribuidor = custoFabrica * percDistribuidor;
		valorImpostos = custoFabrica * percImpostos;
		
		custoConsumidor = custoFabrica + valorDistribuidor + valorImpostos;
		
		System.out.println("CUSTO DE FÁBRICA: R$ " + custoFabrica);
		System.out.println("CUSTO PARA O CONSUMIDOR: R$ " + custoConsumidor);
		
		in.close();
		
	}
}