package exer1a14;

import java.util.Scanner;

public class VerificadorPar {

	public static void main(String[] args) {
			int num;
			Scanner sc = new Scanner(System.in);
			System.out.println("Insira um número: ");
			num = sc.nextInt();
			if(num % 2 == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Impar");
		}
	}
}
