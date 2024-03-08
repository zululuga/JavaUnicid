package exerc1a14;

import java.util.Scanner;

public class ConversorMoeda {
	public static void main(String[] args) {
		double dolar;
		double cambio;
		double real;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira uma quantia em dólares: ");
        dolar = scanner.nextDouble();
        System.out.println("Insira a taxa de câmbio: ");
        cambio = scanner.nextDouble();
        scanner.close();
        
        real = (dolar * 5) - (cambio * 5) ;
        System.out.println("O valor em reais é de: " + real);

	}
}
