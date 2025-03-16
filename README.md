Banco Digital em Java
📄 Descrição do Projeto
Este projeto é um sistema de Banco Digital, desenvolvido em Java, que permite gerenciar contas bancárias de forma simples e eficiente. Ele utiliza os conceitos fundamentais da Programação Orientada a Objetos (POO), como herança, polimorfismo e encapsulamento, e apresenta uma interface interativa baseada em terminal.

O sistema foi projetado para demonstrar boas práticas no desenvolvimento de software modularizado em Java, com foco na organização de pacotes, reutilização de código e separação de responsabilidades.

💡 Funcionalidades
Criar Conta: Criação de contas Corrente e Poupança para clientes.

Depositar: Adiciona saldo à conta do cliente.

Saque: Retira saldo da conta, respeitando o limite disponível.

Transferência: Realiza transferência de valores entre contas diferentes.

Empréstimo: Simula a concessão de crédito ao cliente.

Consultar Saldo: Exibe o saldo atual de uma conta.

Histórico de Transações: Registra todas as operações realizadas em uma conta.

Imprimir Extrato: Apresenta o saldo e o histórico de transações.

Listar Clientes: Exibe todos os clientes cadastrados no sistema.

🚀 Tecnologias Utilizadas
Java: Linguagem principal utilizada para implementar o sistema.

POO (Programação Orientada a Objetos): Herança, polimorfismo e encapsulamento.

Estrutura modular com pacotes para organização do código.

🗂 Estrutura do Projeto
src/
├── main/
│   └── BancoDigital.java      # Classe principal (ponto de entrada do programa)
├── model/                     # Representações de dados e entidades
│   ├── Cliente.java           # Dados do cliente
│   ├── Conta.java             # Classe abstrata para contas
│   ├── ContaCorrente.java     # Implementação para contas correntes
│   └── ContaPoupanca.java     # Implementação para contas poupança
└── service/                   # Regras de negócio e operações bancárias
    └── Banco.java             # Gerencia as contas e clientes

🎮 Como Executar o Projeto
Pré-requisitos:

Certifique-se de ter o Java 8 ou superior instalado.

Uma IDE como IntelliJ IDEA, Eclipse ou utilize o terminal com javac.

Clone o Repositório:

bash
git clone https://github.com/SEU_USUARIO/banco-digital.git
cd banco-digital
Compile o Projeto:

No terminal, compile todas as classes:

bash
javac src/**/*.java
Execute o Projeto:

Execute a classe principal:

bash
java src.main.BancoDigital
Interaja com o Menu:

O programa apresentará um menu interativo com todas as funcionalidades implementadas:

plaintext
--- Menu do Banco Digital ---
1. Criar Conta
2. Depositar
3. Sacar
4. Transferir
5. Solicitar Empréstimo
6. Consultar Saldo
7. Imprimir Extrato
8. Listar Clientes
9. Sair
Escolha uma opção:
🛠 Funcionalidades Detalhadas
1. Criar Conta
Registre um cliente com nome e CPF.

Escolha o tipo de conta: Conta Corrente ou Conta Poupança.

2. Depósito
Adicione um valor ao saldo de uma conta informando o CPF do cliente.

3. Saque
Retire um valor do saldo de uma conta (verificando saldo suficiente).

4. Transferência
Transfira valores entre contas existentes no sistema.

5. Empréstimo
Conceda um valor à conta de um cliente como um empréstimo.

6. Consultar Saldo
Verifique o saldo atualizado da conta de um cliente pelo CPF.

7. Imprimir Extrato
Exibe o saldo atual e o histórico de transações da conta.

8. Listar Clientes
Mostra todos os clientes cadastrados no banco, com nome e CPF.

🔧 Melhorias Futuras
Persistência de Dados:

Armazenar informações em arquivos ou banco de dados para manter os dados salvos após o encerramento do programa.

Validação de Dados:

Implementar validações mais robustas, como CPF válido e limites de transações.

Interface Gráfica (GUI):

Substituir o menu de texto por uma interface gráfica amigável.

Gerenciamento de Taxas e Juros:

Aplicar taxas sobre transferências ou definir juros nos empréstimos.

🧑‍💻 Autor
Antônio William

GitHub: antoniowilliamg

LinkedIn: [Seu Perfil](https://www.linkedin.com/in/antonio-william/)

📜 Licença
Este projeto está licenciado sob a Licença MIT. Sinta-se livre para usá-lo e modificá-lo conforme necessário.
