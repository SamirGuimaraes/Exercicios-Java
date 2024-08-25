/*
 * Escreva um programa que, com base em uma temperatura em graus celsius, a converta 
 * e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F), seguindo as fórmulas: 
 * F = C * 1.8 + 32; 
 * K = C + 273.15; 
 * Re = C * 0.8; 
 * Ra = C * 1.8 + 32 + 459.67
 */

package ExerciciosJava;
import java.util.Scanner;

public class exerc011 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a temperatura em grau celsius: ");
        float grausCelsius = sc.nextFloat();

        float grausFahrenheit, grausKelvin, grausRankine, grausReaumur;

        grausFahrenheit = grausCelsius * 1.8f + 32.0f;
        grausReaumur = grausCelsius * 0.8f;
        grausRankine = grausCelsius * 1.8f + 32.0f +459.7f;
        grausKelvin = grausCelsius + 273.67f;

        System.out.println("Essa temperatura corresponde respectivamente a:");
        System.out.println(grausFahrenheit + "º Graus Fahrenheit.");
        System.out.println(grausKelvin + "º Graus Kelvin.");
        System.out.println(grausReaumur + "º Graus Reaumur.");
        System.out.println(grausRankine + "º Graus Rankine.");

        sc.close();
        
    }
}
