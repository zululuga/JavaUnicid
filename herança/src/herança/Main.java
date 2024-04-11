package herança;

public class Main {
	public static void main(String[] args) {
		
		//quadrado
		Quadrado quadrado = new Quadrado(5);
		System.out.println("Área do quadrado: " + quadrado.calcularArea());
		System.out.println("Perímetro do quadrado: " + quadrado.calcularPerimetro());
		
		//Circulo
		Circulo circulo = new Circulo(3);
		System.out.println("Área do Círculo: " + circulo.calcularArea());
		System.out.println("Perímetro do Círculo: " + circulo.calcularPerimetro());
		
	}
}
