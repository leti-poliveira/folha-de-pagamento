package org.example;

public class Funcionario {
    private String nome;
    private double salarioBruto;
    private double valeTransporte;

    public Funcionario(String nome, double salarioBruto) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.valeTransporte = 0.0; // Inicializa o VT como zero
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getValeTransporte() {
        return valeTransporte;
    }

    public void setValeTransporte(double valeTransporte) {
        this.valeTransporte = valeTransporte;
    }
}
