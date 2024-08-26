/*
 * Cálculo de Potência
 * Escreva um programa que leia dois números inteiros, base e expoente, e calcule a 
 * potência (base^expoente) utilizando laços de repetição em vez da função Math.pow().
 */

package ExerciciosJava;
import java.util.Scanner;

public class exerc020 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Para cálculo de potência informe a base do cálculo: ");
        int base = sc.nextInt();
        System.out.println("E por último informe o expoente: ");
        int expoente = sc.nextInt();

        int resultado = 1;
        for (int i = 0; i < expoente; i++){
            resultado *= base;
        }

        System.out.println(resultado);

        sc.close();
    }
    
}
