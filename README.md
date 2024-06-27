# Sistema de Folha de Pagamento em Java

Este projeto em Java demonstra um sistema simples de folha de pagamento que calcula o salário líquido de funcionários com base no salário bruto, descontos de INSS e IRPF.

## Estrutura do Projeto

O projeto é estruturado da seguinte maneira:

- **Funcionario.java**: Define a classe `Funcionario` que representa os dados de um funcionário.
- **FolhaDePagamento.java**: Contém a classe `FolhaDePagamento` que realiza os cálculos de folha de pagamento.
- **Main.java**: Classe de execução que instancia funcionários e calcula a folha de pagamento para demonstração.

## Funcionamento

### Funcionario.java

A classe `Funcionario` possui os seguintes atributos e métodos:

- **Atributos**:
  - `nome`: Nome do funcionário.
  - `salarioBruto`: Salário bruto do funcionário.

- **Métodos**:
  - `getNome()`: Retorna o nome do funcionário.
  - `getSalarioBruto()`: Retorna o salário bruto do funcionário.

### FolhaDePagamento.java

A classe `FolhaDePagamento` realiza os cálculos de folha de pagamento:

- **Métodos Estáticos**:
  - `calcularFolha(Funcionario funcionario)`: Calcula o desconto de INSS, IRPF e o salário líquido com base no salário bruto do funcionário passado como parâmetro.

- **Cálculo de Descontos**:
  - INSS: Calculado de acordo com faixas de salário bruto.
  - IRPF: Calculado com base na base de cálculo após descontar o INSS.

### Main.java

A classe `Main` demonstra a execução do sistema:

- Instancia dois funcionários com diferentes salários brutos.
- Chama o método `calcularFolha()` da classe `FolhaDePagamento` para cada funcionário.

## Como Executar

Para executar o projeto:

1. Clone este repositório.
2. Abra o projeto em sua IDE Java preferida.
3. Execute o arquivo `Main.java`.

## Contribuições

Contribuições são bem-vindas via pull requests. Para grandes mudanças, abra um issue primeiro para discutir o que você gostaria de mudar.
