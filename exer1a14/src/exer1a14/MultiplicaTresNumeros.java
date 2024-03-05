package exer1a14;
import java.util.Scanner;

public class MultiplicaTresNumeros {
	public static void main(String args[]) {
	int a;
	int b;
	int c;
	int d;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Entre com 3 números: ");
	a = sc.nextInt();
	b = sc.nextInt();
	c = sc.nextInt();
	d = (a + b + c);
	System.out.println("Resultado da soma dos 3: " + d);
	}
}
