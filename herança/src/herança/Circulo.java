package herança;

public class Circulo extends FormaGeometrica {
	double raio;
	
	Circulo(double raio) {
		this.raio = raio;
	}
	
	double calcularArea() {
			return Math.PI * raio * raio;
	}
	
	double calcularPerimetro() {
		return 2 * Math.PI * raio;
	}
}
