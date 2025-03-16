# **Banco Digital**

Este projeto é uma aplicação de um **Banco Digital** desenvolvida em Java, utilizando os conceitos de **POO (Programação Orientada a Objetos)**, como **herança**, **polimorfismo** e **encapsulamento**. O código segue uma estrutura modular com pacotes para garantir organização e fácil manutenção.

---

## **🛠 Funcionalidades**
- **Criar Conta:** Registre clientes com nome e CPF e escolha entre Conta Corrente ou Poupança.
- **Depósito:** Adicione saldo em uma conta por CPF.
- **Saque:** Retire saldo de uma conta, validando o saldo disponível.
- **Transferência:** Realize transferências entre contas existentes no sistema.
- **Solicitar Empréstimo:** Conceda valores como empréstimos a uma conta.
- **Consultar Saldo:** Verifique o saldo atualizado por CPF.
- **Imprimir Extrato:** Exiba o saldo e o histórico de transações.
- **Listar Clientes:** Veja todos os clientes cadastrados, com nome e CPF.

---

## **🗂 Estrutura do Projeto**
```plaintext
src/
├── main/
│   └── BancoDigital.java       # Classe principal (ponto de entrada do programa)
├── model/                      # Representações de dados e entidades
│   ├── Cliente.java            # Dados do cliente
│   ├── Conta.java              # Classe abstrata para contas
│   ├── ContaCorrente.java      # Implementação para contas correntes
│   └── ContaPoupanca.java      # Implementação para contas poupança
└── service/                    # Regras de negócio e operações bancárias
    └── Banco.java              # Gerencia as contas e clientes


🧑‍💻 Autor
Antônio William

GitHub: antoniowilliamg

LinkedIn: [Antonio William](https://www.linkedin.com/in/antonio-william/)

📜 Licença
Este projeto está licenciado sob a Licença MIT. Sinta-se livre para usá-lo e modificá-lo conforme necessário.
