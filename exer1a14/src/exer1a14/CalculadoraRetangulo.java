package exer1a14;

import java.util.Scanner;

public class CalculadoraRetangulo {

	public static void main(String[] args) {
			double base;
			double altura;
			double area;
			Scanner sc = new Scanner(System.in);
			System.out.println("Insira a base do retângulo: ");
			base = sc.nextDouble();
			System.out.println("Insira a altura do retângulo: ");
			altura = sc.nextDouble();
			area = base * altura;
			System.out.println("Área do retângulo: " + area + " cm");

	}

}
