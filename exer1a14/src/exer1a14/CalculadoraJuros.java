package exer1a14;

import java.util.Scanner;

public class CalculadoraJuros {

	public static void main(String[] args) {
		double valor;
		double taxa;
		double tempo;
		double resultado;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o valor principal: ");
        valor = scanner.nextDouble();
        System.out.println("Insira a taxa: ");
        taxa = scanner.nextDouble();
        System.out.println("Insira o tempo: ");
        tempo = scanner.nextDouble();
        
        resultado = valor * (1 + taxa * tempo);
        System.out.println("O total com os juros foi de: " + resultado);

	}

}
