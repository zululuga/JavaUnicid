package exer1a14;

import java.util.Scanner;

public class Volume {

	public static void main(String[] args) {
		double v;
		double pi;
		double r;
		double a;
		pi = 3.14159;
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o valor do raio: ");
		r = sc.nextDouble();
		System.out.println("Insira o valor da altura: ");
		a = sc.nextDouble();
		
		v = pi * r * r * a;
		System.out.println("O volume do cilindro é igual à: " + v);

	}

}
