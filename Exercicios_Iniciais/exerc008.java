/*
 * Escrever um algoritmo que lê:
    - a porcentagem do IPI a ser acrescido no valor das peças
    - o código da peça 1, valor unitário da peça 1, quantidade de peças 1
    - o código da peça 2, valor unitário da peça 2, quantidade de peças 2

    O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
    
    Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)
 */

package ExerciciosJava;
import java.util.Scanner;

public class exerc008 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a porcentaagem a ser acrescida no valor das peças: ");
        float ipi = sc.nextFloat();
        
        System.out.println("Informe o código de identificação da peça 1: ");
        int codigoPeca1 = sc.nextInt();
        System.out.println("Informe o valor unitário da peça 1: ");
        float valorPeca1 = sc.nextFloat();
        System.out.println("Informe a quantidade de peças do tipo 1 disponível: ");
        int qtdePeca1 = sc.nextInt();

        System.out.println("Informe o código de identificação da peça 2: ");
        int codigoPeca2 = sc.nextInt();
        System.out.println("Informe o valor unitário da peça 2: ");
        float valorPeca2 = sc.nextFloat();
        System.out.println("Informe a quantidade de peças do tippo 2 disponível: ");
        int qtdePeca2 = sc.nextInt();

        float valorFinal;

        valorFinal = (valorPeca1*qtdePeca1 + valorPeca2*qtdePeca2) * (ipi/100+1);
        System.out.println("O valor total a ser pago será de R$" +valorFinal);
        sc.close();
    }
}
