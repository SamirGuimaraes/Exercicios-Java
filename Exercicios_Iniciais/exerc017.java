/*
 * Verificação de Número Primo
 * Desenvolva um programa que leia um número inteiro e determine se ele é primo ou não.
 */

package ExerciciosJava;
import java.util.Scanner;

public class exerc017 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número para saber se é primo ou não: ");
        int n = sc.nextInt();

        int cont = 0;
        for (int i = 1; i <= n; i++){

            if ( (n%i) == 0){
                cont = cont+1;
            }
        }

        if (cont == 2){
            System.out.println("Esse número é primo.");
        }else{
            System.out.println("Esse número não é primo.");
        }

        sc.close();
    }    
}
