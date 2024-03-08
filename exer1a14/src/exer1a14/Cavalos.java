package exerc1a14;
import java.util.Scanner;

public class Cavalos {

	public static void main(String[] args) {
			double m;
			double h;
			double tempo;
			double cavalos;
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Insira a quantia da Massa: ");
	        m = scanner.nextDouble();
	        System.out.println("Insira a altura em metros: ");
	        h = scanner.nextDouble();
	        System.out.println("Insira o tempo: ");
	        tempo = scanner.nextDouble();
	        scanner.close();
	        
	        cavalos = (m * h / tempo) / 745.6999;
	        System.out.println("Cavalos para levantar esses quilogramas: " + cavalos);

		}

	}


