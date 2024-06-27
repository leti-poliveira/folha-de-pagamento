package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("João", 3000);
        Funcionario funcionario2 = new Funcionario("Maria", 5000);

        System.out.println("Calculando folha de pagamento...\n");

        FolhaDePagamento.calcularFolha(funcionario1);
        FolhaDePagamento.calcularFolha(funcionario2);
    }
}
