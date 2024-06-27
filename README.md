# Sistema de Folha de Pagamento em Java

Este projeto em Java implementa um sistema simples de folha de pagamento que calcula o salário líquido de funcionários com base no salário bruto, descontos de INSS, IRPF e benefícios como Vale Transporte (VT).

## Estrutura do Projeto

O projeto é estruturado da seguinte maneira:

- **Main.java**: Classe principal que demonstra a execução do sistema.
- **Funcionario.java**: Classe que define os dados de um funcionário.
- **FolhaDePagamento.java**: Classe que realiza os cálculos de folha de pagamento.

## Funcionamento

### Main.java

A classe `Main` é responsável por inicializar o sistema e calcular a folha de pagamento de dois funcionários:

```java
package org.example;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("João", 1412);
        Funcionario funcionario2 = new Funcionario("Maria", 5000);

        System.out.println("Calculando folha de pagamento...\n");

        FolhaDePagamento.calcularFolha(funcionario1);
        FolhaDePagamento.calcularFolha(funcionario2);
    }
}
