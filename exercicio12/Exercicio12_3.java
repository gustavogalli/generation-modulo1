package exercicio12;

import java.util.Scanner;

public class Exercicio12_3 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Quantos segundos tem a duração do evento da fábrica?");
		int totalSegundos = in.nextInt();
		
		int horas = totalSegundos / 3600;
		int minutos = (totalSegundos % 3600) / 60;
		int segundos = (totalSegundos % 3600) % 60;
		
		System.out.println("HORAS: " + horas);
		System.out.println("MINUTOS: " + minutos);
		System.out.println("SEGUNDOS: " + segundos);
		
		in.close();
		
	}
}