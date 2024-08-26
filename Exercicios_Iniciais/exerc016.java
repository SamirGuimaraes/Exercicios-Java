/*
 * Contagem de Números Pares
 * Escreva um programa que leia um número inteiro n e exiba todos os números pares de 0 até 'n'.
 */

package ExerciciosJava;
import java.util.Scanner;

public class exerc016 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número qualquer: ");
        int numero = sc.nextInt();

        System.out.println("O números pares de 0 até " +numero+ " são: ");
        for (int i = 0; i <= numero; i++){
            if ( (i%2) == 0){
                System.out.println(i);
            }
        }

        sc.close();
    }
}
