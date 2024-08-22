/*
Exercício que realiza a leitura do nome e idade do usuário e logo após imprime os dados
*/

package ExerciciosJava;
import java.util.Scanner;

public class exerc002 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Informe sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Nome: " +nome+ "\nIdade: " +idade);


        sc.close();
    }
    
}
