package org.example;

public class Pessoa {
    private double peso;
    private double altura;

   /** public Pessoa( double altura, double peso) {
        this.peso = peso;
        this.altura = altura;
    }*/

    public double calcularImc() {
        return peso/(altura*altura);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
