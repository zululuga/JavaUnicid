package exer1a3_19_03;


public class Apresentar {
	private String nome;
	private String curso;
	private int idade;

			public Apresentar(String nome, String curso, int idade) {
				// TODO Auto-generated constructor stub
				this.nome = nome;
				this.curso = curso;
				this.idade = idade;
			}

			public void mostrar() {
				System.out.println("Informações:");
				System.out.println("Nome: " + nome);
				System.out.println("Curso: " + curso);
				System.out.println("Idade: " + idade);
			}
}


