package herança;

public class Quadrado extends FormaGeometrica {
	double lado;
	
	//construtor	
	Quadrado(double lado) {
		this.lado = lado;
	}
	
	//implementação dos métodos
	double calcularArea() {
		return lado * lado;
	}
	
	double calcularPerimetro() {
		return 4 * lado;
	}
}
