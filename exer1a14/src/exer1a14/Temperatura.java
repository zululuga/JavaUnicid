package exer1a14;
import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		double C;
		double K;
		double F;
		double Re;
		double Ra;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com temperatura em celsius: ");
		C = sc.nextDouble();
		F = (C * 1.8) + 32;
		K = C + 273.15;
		Re = C * 0.8;
		Ra = (C * 1.8) + 32 + 459.67;
		System.out.println("Celsius: " + C);
		System.out.println("Kelvin: " + K);
		System.out.println("Fahrenheit: " + F);
		System.out.println("Reaumur: " + Re);
		System.out.println("Rankine: " + Ra);

	}

}
