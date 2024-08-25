/*
 * Calculdadora simples onde o algorítmo solicita que o usuário defina qual das quatro
 * operações será realizada e após solicita dois números a serem calculados.
 */

package ExerciciosJava;
import java.util.Scanner;

public class exerc012 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculadora \nSoma - Digite 1 \nSubtração - Digite 2 z \nMultiplicação - Digite 3 \nDivisão - Digite 4 \n===>");
        int opcao = sc.nextInt();

        System.out.println("Digite o primeiro número a ser calculado: ");
        float num1 = sc.nextFloat();
        System.out.println("Digite o segundo número a ser calculado: ");
        float num2 = sc.nextFloat();

        float resultado;

        if (opcao == 1){
            resultado = num1 + num2;
            System.out.println("A soma de " +num1+ " e " +num2+ " corresponde a " +resultado);

        }else if (opcao == 2){
            resultado = num1 - num2;
            System.out.println("A subtração de " +num1+ " e " +num2+ " corresponde a " +resultado);

        }else if (opcao == 3){
            resultado = num1 * num2;
            System.out.println("A multiplicação de " +num1+ " e " +num2+ " corresponde a " +resultado);

        }else{
            resultado = num1 / num2;
            System.out.println("A divisão de " +num1+ " e " +num2+ " corresponde a " +resultado);

        }

        sc.close();
    }
}
