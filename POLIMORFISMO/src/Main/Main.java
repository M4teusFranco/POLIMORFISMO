package Main; // Esta Classe pertence ao Pacote Main
import Classes.Pessoa; // Importação da Classe Pessoa do Pacote Classes
import Classes.Professor; // Importação da Classe Professor do Pacote Classes
import Classes.Aluno; // Importação da Classe Aluno do Pacote Classes

public class Main {

	public static void main(String[] args) {
		
		// Criação do objeto Professor "Alan Turing"
		Professor professor = new Professor("Alan Turing");
		
		// Criação do objeto Aluno "Joseph"
		Aluno aluno = new Aluno("Joseph");
		
		// Mensagem que será exibida no Email
		String mensagemProfessor = "Aqui está a Pesquisa que o senhor pediu. \n=========================================================\n";
		
		String mensagemAluno = "Esta é a nota da sua pesquisa: 10. \n=========================================================\n";
		
		
		// Exibe o método de Enviar Email para o Professor
		System.out.println(professor.enviarEmail(mensagemProfessor));
		
		// Exibe o método de Enviar Email para o Aluno
		System.out.println(aluno.enviarEmail(mensagemAluno));
		
	}

}
