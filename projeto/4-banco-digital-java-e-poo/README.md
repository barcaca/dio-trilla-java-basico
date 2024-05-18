# Desafio de Programação Orientada a Objetos

Este é um projeto desenvolvido como parte do desafio de Programação Orientada a Objetos (POO) da Digital Innovation One (DIO). O objetivo deste desafio é criar uma aplicação simplificada de um Banco Digital, utilizando conceitos de modelagem e programação orientada a objetos.

## Funcionalidades

O projeto consiste na implementação das seguintes funcionalidades:

- Criação de classes representando entidades como Banco, Cliente e Conta.
- Implementação de operações bancárias básicas, como saque, depósito e transferência.
- Utilização de herança e polimorfismo para representar diferentes tipos de contas (conta corrente e conta poupança).
- Interface para definir comportamentos padrão das contas.

## Estrutura do Projeto

O projeto está organizado da seguinte forma:

- **Banco.java**: Implementação da classe `Banco`, responsável por gerenciar clientes e contas.
- **Cliente.java**: Implementação da classe `Cliente`, representando os clientes do banco.
- **Conta.java**: Implementação da classe abstrata `Conta`, que define o comportamento básico de uma conta bancária.
- **ContaCorrente.java**: Implementação da classe `ContaCorrente`, que herda de `Conta` e representa uma conta corrente.
- **ContaPoupanca.java**: Implementação da classe `ContaPoupanca`, que herda de `Conta` e representa uma conta poupança.
- **IConta.java**: Interface que define os métodos que devem ser implementados pelas classes de conta.

## Como Utilizar

Para utilizar o projeto, basta clonar este repositório e importá-lo em sua IDE de preferência. Em seguida, você pode executar a aplicação ou realizar testes unitários para verificar o funcionamento das classes e métodos implementados.

## Contribuição

Contribuições são sempre bem-vindas! Se você encontrar algum problema no projeto ou tiver sugestões de melhorias, sinta-se à vontade para abrir uma issue ou enviar um pull request.

## Licença

Este projeto está licenciado sob a licença MIT. Consulte o arquivo [LICENSE](LICENSE) para obter mais informações.
