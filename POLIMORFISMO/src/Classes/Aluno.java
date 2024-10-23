package Classes; // Esta Classe pertence ao Pacote Classes

// Criação da Classe Aluno, herdando a Classe Pessoa
public class Aluno extends Pessoa{
	
	// Construtor da Classe Aluno
	public Aluno(String nome){
		// Chama o construtor da Classe pessoa para inicializar o Atributo
		super(nome); 
	}
	// Implementa o Método para enviar Email ao Aluno
	@Override
	public String enviarEmail(String mensagem) {
        return "Olá, Aluno " + nome + "!\n" + mensagem;

	}

 }
