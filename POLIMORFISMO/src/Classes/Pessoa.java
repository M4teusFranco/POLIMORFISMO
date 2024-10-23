package Classes; // Esta Classe pertence ao Pacote Classes

// Criação da Classe Pai Abstrata Pessoa
public abstract class Pessoa {
	String nome; // Atributo Nome da Classe Pessoa

	// Construtor da Classe Pessoa
	public Pessoa(String nome) {
		this.nome=nome; // Inicializa o Nome
	}
	
	// Cria o método para Enviar Email
	public abstract String enviarEmail(String mensagem);

}
