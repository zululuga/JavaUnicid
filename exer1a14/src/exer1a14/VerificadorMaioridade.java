package exer1a14;

import java.util.Scanner;

	public class VerificadorMaioridade {
		public static void main(String[] args) {
			int idade;
			Scanner sc = new Scanner(System.in);
			System.out.println("Insira a idade: ");
			idade = sc.nextInt();
			if(idade >= 18) {
			System.out.println("Maior de idade");
		} else {
			System.out.println("Menor de idade");
		}
	
	}
}
