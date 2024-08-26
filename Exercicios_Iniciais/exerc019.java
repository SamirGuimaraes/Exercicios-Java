/*
 * Sequência de Fibonacci
 * Crie um programa que leia um número n e exiba os primeiros n termos da sequência de Fibonacci. 
 * A sequência de Fibonacci começa com 0 e 1, e cada termo subsequente é a soma dos dois anteriores.
 */

package ExerciciosJava;
import java.util.Scanner;

public class exerc019 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva um número para visualizar sua sequência de fibonacci: ");
        int num = sc.nextInt();

        int num_Anterior = 0;
        int num_Atual = 1;

        // Imprimindo o primeiro termo (0) da sequência
        System.out.print(num_Anterior + " ");

        for (int i = 2; i <= num; i++) {
            System.out.print(num_Atual + " ");
            int proximo = num_Anterior + num_Atual;
            num_Anterior = num_Atual;
            num_Atual = proximo;
        }
        sc.close();
    }
    
}
