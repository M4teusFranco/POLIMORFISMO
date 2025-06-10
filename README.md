# Sistema de Mensagens Acadêmicas em Java

### 📋 Descrição do Projeto

Este projeto demonstra o uso de herança e polimorfismo em Java através de um sistema de envio de mensagens personalizadas para diferentes membros de uma instituição acadêmica.
Recrie a hierarquia de classes dessa aula e implemente o método enviar email. Esse método deve receber o corpo da mensagem e acrescentar a ela uma saudação de acordo com a implementação do objeto.

#### Componentes principais

- Pessoa.java: Classe abstrata base que define a estrutura comum para todos os indivíduos
- Aluno.java: Classe concreta que representa um aluno, especializando o comportamento de envio de email
- Professor.java: Classe concreta que representa um professor, com sua própria implementação de envio de email
- Main.java: Classe principal que demonstra o polimorfismo na prática

### 🔧 Pré-requisitos

- Java JDK 8 ou superior
- IDE Java (Eclipse, IntelliJ, etc.)
  
1. Clone o repositório:

```
git clone https://github.com/seu-usuario/IMC_ALUNO
```

2. Importe o projeto no Eclipse:
- File → Import → Existing Projects into Workspace
- Selecione a pasta do projeto clonado

3. Execute a classe Main.java e siga as instruções no terminal.

### 🛠️ Funcionalidades Implementadas

Classe abstrata Pessoa com:
- Atributo nome
- Construtor parametrizado
- Método abstrato enviarEmail()

Classes concretas Aluno e Professor que:
- Herdam de Pessoa
- Implementam seu próprio comportamento de envio de email
- Mantêm o princípio de substituição de Liskov

Demonstração de polimorfismo na classe Main

### 📝 Exemplo de saída

```
Olá, Prof. Alan Turing!
Aqui está a Pesquisa que o senhor pediu. 
=========================================================

Olá, Aluno Joseph!
Esta é a nota da sua pesquisa: 10. 
=========================================================
```

## ✒️ Autores

* **Mateus Franco Bezerra** - *Trabalho Inicial* - POLIMORFISMO
