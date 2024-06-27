package org.example;

    public class FolhaDePagamento {
        private static final double TAXA_INSS_ATE_1100 = 0.075;
        private static final double TAXA_INSS_DE_1100_A_2203 = 0.09;
        private static final double TAXA_INSS_DE_2203_A_3305 = 0.12;
        private static final double TAXA_INSS_DE_3305_A_6433 = 0.14;
        private static final double TETO_INSS = 6433.57;

        private static final double FAIXA_IRPF_1 = 0.075;
        private static final double FAIXA_IRPF_2 = 0.15;
        private static final double FAIXA_IRPF_3 = 0.225;
        private static final double FAIXA_IRPF_4 = 0.275;

        public static void calcularFolha(Funcionario funcionario) {
            double salarioBruto = funcionario.getSalarioBruto();

            // Calcula INSS
            double descontoINSS = calcularINSS(salarioBruto);

            // Base de cálculo para IRPF (já descontando INSS)
            double baseIRPF = salarioBruto - descontoINSS;

            // Calcula IRPF
            double descontoIRPF = calcularIRPF(baseIRPF);

            // Salário líquido
            double salarioLiquido = salarioBruto - descontoINSS - descontoIRPF;

            // Mostra resultados
            System.out.println("Funcionário: " + funcionario.getNome());
            System.out.println("Salário Bruto: R$" + salarioBruto);
            System.out.println("Desconto INSS: R$" + descontoINSS);
            System.out.println("Desconto IRPF: R$" + descontoIRPF);
            System.out.println("Salário Líquido: R$" + salarioLiquido);
            System.out.println();
        }

        private static double calcularINSS(double salarioBruto) {
            if (salarioBruto <= 1100) {
                return salarioBruto * TAXA_INSS_ATE_1100;
            } else if (salarioBruto <= 2203.48) {
                return salarioBruto * TAXA_INSS_DE_1100_A_2203;
            } else if (salarioBruto <= 3305.22) {
                return salarioBruto * TAXA_INSS_DE_2203_A_3305;
            } else if (salarioBruto <= TETO_INSS) {
                return salarioBruto * TAXA_INSS_DE_3305_A_6433;
            } else {
                return TETO_INSS * TAXA_INSS_DE_3305_A_6433;
            }
        }

        private static double calcularIRPF(double baseIRPF) {
            if (baseIRPF <= 1903.98) {
                return 0;
            } else if (baseIRPF <= 2826.65) {
                return (baseIRPF * FAIXA_IRPF_1) - 142.8;
            } else if (baseIRPF <= 3751.05) {
                return (baseIRPF * FAIXA_IRPF_2) - 354.8;
            } else if (baseIRPF <= 4664.68) {
                return (baseIRPF * FAIXA_IRPF_3) - 636.13;
            } else {
                return (baseIRPF * FAIXA_IRPF_4) - 869.36;
            }
        }
    }
