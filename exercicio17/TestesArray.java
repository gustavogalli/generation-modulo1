package exercicio17;

import java.util.Scanner;

public class TestesArray {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int[] numeros = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		double[] notas = {0.5, 10.0, 9.5, 7.2, 3.1, 5.4};
		String[] nomes = new String[4];
		
		// tamanho do array
		System.out.println(numeros.length);
		
		// populando um array
		for(int i = 0; i < nomes.length; i++) {
			System.out.print("Digite um nome: ");
			nomes[i] = in.nextLine();
		}
		
		// imprimindo um array com FOR EACH
		for(String nome: nomes) {
			System.out.println("Nome = " + nome);
		}
		
		// imprimindo um array com FOR
		for(int i = 0; i < nomes.length; i++) {
			System.out.println("Nome " + i + " = " + nomes[i]);
		}
		
		in.close();
		
	}
}