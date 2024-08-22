/*
 * Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu 
antecessor e seu sucessor.
 */

package ExerciciosJava;
import java.util.Scanner;

public class exerc010 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número aleatório: ");
        int numero = sc.nextInt();

        int antecessor, sucessor;

        antecessor = numero-1;
        sucessor = numero+1;


        System.out.println("O Antecessor do número " +numero+ " corresponde a " +antecessor);
        System.out.println("O Sucessor do número " +numero+ " corresponde a " +sucessor);

        sc.close();
    }
}
