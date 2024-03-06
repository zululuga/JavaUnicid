package exer1a14;

import java.util.Scanner;

public class CalculadoraIMC {

	public static void main(String[] args) {
		double peso;
		double altura;
		double IMC;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o peso: ");
		peso = sc.nextDouble();
		System.out.println("Entre com a altura: ");
		altura = sc.nextDouble();
		IMC = peso / (altura * altura);
		if(IMC <= 18.5) {
			System.out.println("Resultado do IMC: " + IMC);
			System.out.println("Magreza.");
		} else if(IMC >= 24.9) {
			System.out.println("Resultado do IMC: " + IMC);
			System.out.println("Normal.");
		} else {
			System.out.println("Resultado do IMC: " + IMC);
			System.out.println("Acima do peso.");
		}

	}

}
