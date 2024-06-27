package org.example;

public class FolhaDePagamento {

    public static void calcularFolha(Funcionario funcionario) {
        double salarioBruto = funcionario.getSalarioBruto();
        double valeTransporte = funcionario.getValeTransporte();

        // Calcula INSS
        double descontoINSS = calcularINSS(salarioBruto);

        // Base de cálculo para IRPF (já descontando INSS)
        double baseIRPF = salarioBruto - descontoINSS;

        // Calcula IRPF
        double descontoIRPF = calcularIRPF(baseIRPF);

        // Calcula desconto de VT
        double descontoVT = calcularDescontoVT(salarioBruto);

        // Salário líquido
        double salarioLiquido = salarioBruto - descontoINSS - descontoIRPF + valeTransporte - descontoVT;

        // Mostra resultados
        System.out.println("Funcionário: " + funcionario.getNome());
        System.out.println("Salário Bruto: R$" + salarioBruto);
        System.out.println("Desconto INSS: R$" + descontoINSS);
        System.out.println("Desconto IRPF: R$" + descontoIRPF);
        System.out.println("Vale Transporte: R$" + valeTransporte);
        System.out.println("Desconto VT: R$" + descontoVT);
        System.out.println("Salário Líquido: R$" + salarioLiquido);
        System.out.println();
    }

    private static double calcularINSS(double salarioBruto) {
        // Simulação simples de cálculo de INSS
        if (salarioBruto <= 1500) {
            return salarioBruto * 0.08; // 8% de INSS para salário até 1500
        } else {
            return salarioBruto * 0.1; // 10% de INSS para salário acima de 1500
        }
    }

    private static double calcularIRPF(double baseIRPF) {
        // Simulação simples de cálculo de IRPF
        if (baseIRPF <= 3000) {
            return 0; // Isento de IRPF para base de até 3000
        } else {
            return baseIRPF * 0.15; // 15% de IRPF para base acima de 3000
        }
    }

    private static double calcularDescontoVT(double salarioBase) {
        // Desconto de VT limitado a até 6% do salário base conforme CLT
        double limiteDesconto = salarioBase * 0.06;
        return Math.min(limiteDesconto, salarioBase);
    }
}
