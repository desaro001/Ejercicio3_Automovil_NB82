package com.fernandopaniagua.ejercicio3;

/**
 *
 * @author formador
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private String color;
    private String matricula;
    private int potencia;

    public Vehiculo() {
        this.marca = new String("Desconocido");
        this.modelo = new String("Desconocido");
        this.color = "Beige";
    }

    public Vehiculo(String marca, String modelo, String color, String matricula, int potencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.matricula = matricula;
        this.potencia = potencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
    public void arrancar(){
        System.out.println("Arrancando...");
    }
    public void avanzar(){
        System.out.println("Avanzando...");
    }
    public void parar(){
        System.out.println("Parando...");
    }
    
}
