package exercicio12;

import java.util.Scanner;

public class Exercicio12_1 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Quantos anos você tem?");
		int anos = in.nextInt();
		
		System.out.println("Quantos meses você tem?");
		int meses = in.nextInt();
		
		System.out.println("Quantos dias você tem?");
		int dias = in.nextInt();
		
		int total = (anos * 365) + (meses * 30) + dias;
		
		System.out.println("Você tem um total de " + total + " dias de vida.");

		in.close();
		
	}
}