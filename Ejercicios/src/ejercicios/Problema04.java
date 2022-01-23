/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author reroes
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] bases = {100, 90, 80, 70, 60};
        double[] potencias = {2, 3, 2, 2, 1};
        double[] resultado = new double[5];
        for (int i = 0; i < bases.length; i++) {
            resultado[i] = potencia(bases[i], potencias[i]);

        }
        System.out.printf("%s\n", suma(resultado, resultado.length));
    }

    public static double potencia(double base, double exponente) {

        if (exponente == 1) {
            return base;
        } else {

            return base * potencia(base, exponente - 1);
        }
    }

    public static double suma(double[] arreglo, int tamanio) {

        if (tamanio == 1) {
            return arreglo[0];
        } else {
            return arreglo[tamanio - 1] + suma(arreglo, tamanio - 1);
        }
    }
}
