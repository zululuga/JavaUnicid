package exer1a14;

import java.util.Scanner;

public class ConversorTemperatura {
	public static void main(String[] args) {
		double C;
		double F;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com temperatura em celsius: ");
		C = sc.nextDouble();
		F = (C * 9/5) + 32;
		System.out.println("Fahrenheit: " + F);

	}
}
