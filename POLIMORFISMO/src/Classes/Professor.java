package Classes; // Esta Classe pertence ao Pacote Classes

// Criação da Classe Professor, herdando a Classe Pessoa
public class Professor extends Pessoa {
	
	// Construtor da Classe Professor
	public Professor(String nome) {
		// Chama o construtor da Classe Pessoa para inicializar o Atributo
		super(nome);
		
		}	
	
	// Implementa o Método para enviar Email ao Professor
	@Override
    public String enviarEmail(String mensagem) {
        return "Olá, Prof. " + nome + "!\n" + mensagem;
	}
}
