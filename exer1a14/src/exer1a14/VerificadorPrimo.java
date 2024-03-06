package exer1a14;
import java.util.Scanner;

public class VerificadorPrimo {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite um número inteiro positivo: ");
	        int numero = scanner.nextInt();
	        scanner.close();

	        if (ehPrimo(numero)) {
	            System.out.println(numero + " é um número primo!");
	        } else {
	            System.out.println(numero + " não é um número primo.");
	        }
	    }

	    private static boolean ehPrimo(int numero) {
	        if (numero <= 1) {
	            return false;
	        }
	        for (int i = 2; i * i <= numero; i++) {
	            if (numero % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	
}
