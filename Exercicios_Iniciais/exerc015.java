/*
 *  Ler um ano de nascimento e ano atual. Imprimir a idade da
* pessoa. Se a idade for maior ou igual a 18 leia o nome da pessoa e
* imprima o nome digitado e uma mensagem informando que sua
* entrada é permitida. (Ex: Fulano, sua entrada foi permitida.)
 */

package ExerciciosJava;
import java.util.Scanner;

public class exerc015 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu nome por favor: ");
        String nome = sc.nextLine();
        System.out.println("Para entrar no recinto informe sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 18){
            System.out.println(nome+ ", sua entrada foi permitida.");

        }else{
            System.out.println(nome+ ", sua entrada não foi permitida.");

        }
        

        sc.close();
    }
    
}
