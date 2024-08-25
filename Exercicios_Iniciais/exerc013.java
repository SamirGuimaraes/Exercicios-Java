/*
 * Algoritmo que verifica se um número escrito pelo usuário é ímpar ou par.
 */

package ExerciciosJava;
import java.util.Scanner;

public class exerc013 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número qualquer para verificar se o mesmo é ímpar ou par: ");
        int numero = sc.nextInt();

        if ( (numero % 2) != 0){
            System.out.println("O número " +numero+ " é um número ímpar.");

        }else{
            System.out.println("O número " +numero+ " é um número par.");

        }

        sc.close();
        
    }
}
