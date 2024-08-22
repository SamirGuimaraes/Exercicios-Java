/*
Informar um saldo e imprimir o saldo com reajuste de 1%.
*/

package ExerciciosJava;
import java.util.Scanner;

public class exerc007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe seu salario atual para reajuste:");
        float salario = sc.nextFloat();

        float novoSalario;
        novoSalario = salario * 1.01f;

        System.out.println("Com um reajuste de 1% seu novo salário corresponde a R$" +novoSalario);

        sc.close();
    }
}
