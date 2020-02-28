package com.fernandopaniagua.ejercicio3;

/**
 *
 * @author formador
 */
public class Ejecutador {
    public static void main(String[] args) {
        Vehiculo skoda = new Vehiculo("Skoda", "Fabia", "Gris", "M-7796-HH", 80);
        skoda.arrancar();
        for (int i = 0; i < 10; i++) {
            skoda.avanzar();
        }
        skoda.parar();
    }
}
