package exercicio16;

import java.util.Scanner;

public class Exercicio16_3 {

	public static void main(String[] args) {
		
//		3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
		
		Scanner in = new Scanner(System.in);
		
		int idade = 0, menosDe21 = 0, maisDe50 = 0;
		
		while(idade != -99) {
			System.out.println("Digite uma idade: ");
			idade = in.nextInt();
			
			if(idade < 21 && idade >= 0) {
				menosDe21++;
			} else if(idade > 50) {
				maisDe50++;
			}
		}
		
		System.out.println("Menos de 21 anos: " + menosDe21);
		System.out.println("Mais de 50 anos:  " + maisDe50);
		
		
		in.close();
	}
}