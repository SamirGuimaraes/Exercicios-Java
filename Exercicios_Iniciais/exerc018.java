/*
 * Fatorial de um Número
 * Escreva um programa que leia um número inteiro não negativo e calcule o fatorial desse número. O fatorial de um número n é o produto de todos os inteiros positivos menores ou iguais a n.
 */

package ExerciciosJava;
import java.util.Scanner;

public class exerc018 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para descobrir seu fatorial: ");
        int numero = sc.nextInt();

        int fat = 1;
        for (int i = 1; i <= numero; i++){
            fat = fat*i;

        }

        System.out.println("O fatorial de " +numero+ " corresponde a " +fat);
        sc.close();
    }
}
