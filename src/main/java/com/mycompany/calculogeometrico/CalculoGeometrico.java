package com.mycompany.calculogeometrico;

/*
 * Materia: Programación Orientada a Objetos
 * Autor: Jeison Teobaldo Garcia Arreaga
 * Funcionalidad: Este programa solicita al usuario el largo y ancho de un rectángulo,
 *                y calcula el área y el perímetro utilizando fórmulas geométricas.
 */

import java.util.Scanner;

public class CalculoGeometrico {

    public static void main(String[] args) {

        // Encabezado
        System.out.println("========================================");
        System.out.println("     CALCULO DE AREA Y PERIMETRO        ");
        System.out.println("   Autor: Jeison Garcia Arreaga          ");
        System.out.println("========================================\n");

        // Crear objeto Scanner para la entrada del usuario
        Scanner entrada_usuario = new Scanner(System.in);

        // Declaración de variables
        float largo_rectangulo;
        float ancho_rectangulo;
        float area_rectangulo;
        float perimetro_rectangulo;
        boolean entrada_valida = true;
        String mensaje_resultado;

        // Solicitar datos al usuario
        System.out.print("Ingrese el largo del rectangulo (en metros): ");
        largo_rectangulo = entrada_usuario.nextFloat();

        System.out.print("Ingrese el ancho del rectangulo (en metros): ");
        ancho_rectangulo = entrada_usuario.nextFloat();

        
        // Validar que los valores sean positivos y diferentes
        if (largo_rectangulo <= 0 || ancho_rectangulo <= 0) {
            entrada_valida = false;
            mensaje_resultado = "Error: Las dimensiones deben ser mayores a cero.";
        } else if (largo_rectangulo == ancho_rectangulo) {
            entrada_valida = false;
            mensaje_resultado = "Error: El largo y el ancho no pueden ser iguales. No debe ser un cuadrado.";
        } else {
            // Calcular área y perímetro
            area_rectangulo = largo_rectangulo * ancho_rectangulo;
            perimetro_rectangulo = 2 * (largo_rectangulo + ancho_rectangulo);


            // Preparar el mensaje con resultados
            mensaje_resultado = "\nResultados para el rectángulo:\n";
            mensaje_resultado += "- Largo: " + largo_rectangulo + " m\n";
            mensaje_resultado += "- Ancho: " + ancho_rectangulo + " m\n";
            mensaje_resultado += "- Area: " + area_rectangulo + " m^2\n";
            mensaje_resultado += "- Perimetro: " + perimetro_rectangulo + " m";
        }

        // Mostrar resultado o mensaje de error
        System.out.println(mensaje_resultado);
    }
}
