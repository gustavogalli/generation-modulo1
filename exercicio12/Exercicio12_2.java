package exercicio12;

import java.util.Scanner;

public class Exercicio12_2 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Quantos dias de vida você tem?");
		int totalDias = in.nextInt();
		
		int anos = totalDias / 365;
		int meses = (totalDias % 365) / 30;
		int dias = (totalDias % 365) % 30;
		
		System.out.println("Vocẽ tem " + anos + " anos, " + meses + " meses e " + dias + " dias de vida.");

		in.close();
		
	}
}