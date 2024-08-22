/*
 * Programa que leia o número de identificação, as 3 notas obtidas por um aluno
nas 3 avaliações e a média dos exercícios (ME) que fazem parte da avaliação, e
calcule a média de aproveitamento, usando a fórmula: MA = (nota1 + nota2 * 2 + nota3
* 3 + ME)/7.
Seu programa deve exibir o número do aluno, suas notas, a média dos exercícios, a
média de aproveitamento, o conceito correspondente e a mensagem 'Aprovado' se o
conceito for A, B ou C, e 'Reprovado' se o conceito for D ou E.
 */

package ExerciciosJava;
import java.util.Scanner;

public class exerc003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.println("Informe o número de identificação do aluno: ");
        int identificacao = sc.nextInt();
        System.out.println("Informe sua primeira nota: ");
        float nota1 = sc.nextFloat();
        System.out.println("Informe sua segunda nota: ");
        float nota2 = sc.nextFloat();
        System.out.println("Informe sua terceira nota: ");
        float nota3 = sc.nextFloat();
        System.out.println("Por último informe a média dos exercícios: ");
        float medExercicios = sc.nextFloat();
        

        float mediaFinal;
        mediaFinal = (nota1 + (nota2*2) + (nota3*3) + medExercicios)/7;
        
        char conceito;
        if (mediaFinal >= 9.0){
            conceito = 'A';
        }else if (mediaFinal >= 7.5){
            conceito = 'B';
        }else if (mediaFinal >= 6.0){
            conceito = 'C';
        }else if (mediaFinal >= 4.0){
            conceito = 'D';
        }else{
            conceito = 'E';
        }
        
        System.out.println("Aluno: " +identificacao);
        System.out.println("Primeira nota: " +nota1+ "\nSegunda nota: " +nota2+ "\nTerceira nota: " +nota3+ "\nMédia dos Exercícios " +medExercicios);
        if (conceito == 'A' || conceito == 'B' || conceito == 'C'){
            System.out.println("Situaçao do aluno: Aprovado");
        }else{
            System.out.println("Situação do aluno: Reprovado");
        }

        sc.close();
    }
    
}
