/*
 * Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
(1SM=R$788,00)
 */

package ExerciciosJava;
import java.util.Scanner;

public class exerc009 {
    public static void main(String[] args) {
        
        final float SM = 788;
        Scanner sc =  new Scanner(System.in);

        System.out.println("Informe o seu salário: ");
        float salario = sc.nextFloat();

        float qtdeSalario;
        qtdeSalario = salario/SM;

        System.out.println("Você ganha " +qtdeSalario+ " salário minimos.");
        sc.close();
    }
}
