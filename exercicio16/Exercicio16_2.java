package exercicio16;

import java.util.Scanner;

public class Exercicio16_2 {

	public static void main(String[] args) {
		
//		2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		
		Scanner in = new Scanner(System.in);
		
		int pares = 0, impares = 0;
		
		for(int i = 1; i <= 10; i++) {
			System.out.print("Digite um número: ");
			int n = in.nextInt();
			
			if(n % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
		}
		
		System.out.println("PARES: " + pares);
		System.out.println("ÍMPARES: " + impares);
		
		in.close();
		
	}
}