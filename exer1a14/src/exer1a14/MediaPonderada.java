package exer1a14;

import java.util.Scanner;

public class MediaPonderada {
	public static void main(String args[]) {
	int nota1;
	int peso1;
	int nota2;
	int peso2;
	int nota3;
	int peso3;
	int ponderada;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Entre com a primeira nota e em seguida o seu peso: ");
	nota1 = sc.nextInt();
	peso1 = sc.nextInt();
	System.out.println("Entre com a segunda nota e em seguida o seu peso: ");
	nota2 = sc.nextInt();
	peso2 = sc.nextInt();
	System.out.println("Entre com a terceira nota e em seguida o seu peso: ");
	nota3 = sc.nextInt();
	peso3 = sc.nextInt();
	
	ponderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);
	System.out.println("Resultado da ponderada: " + ponderada);
	}
}
