package exercicio12;

import java.util.Scanner;

public class Exercicio12_5 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Qual a primeira nota?");
		double nota1 = in.nextInt();
		
		System.out.println("Qual a segunda nota?");
		double nota2 = in.nextInt();
		
		System.out.println("Qual a terceira nota?");
		double nota3 = in.nextInt();
		
		int peso1 = 2;
		int peso2 = 3;
		int peso3 = 5;
		
		int pesos = peso1 + peso2 + peso3;
		
		double totalNotas = nota1 + nota2 + nota3;
		
		double media = totalNotas / pesos;
		
		System.out.println("A média é: " + media);
		
		in.close();
		
	}
}