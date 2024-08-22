/*
 * Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
 */

package ExerciciosJava;
import java.util.Scanner;

public class exerc005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe sua data de nascimento no formato de Ano/Mês/Dia \nEx: 27 anos, 8 meses e 12 dias");
        System.out.println("Informe quantos anos têm: ");
        int idadeAno = sc.nextInt();
        System.out.println("Informe quantos meses têm: ");
        int idadeMes = sc.nextInt();
        System.out.println("Informe quantos dias têm: ");
        int idadeDia = sc.nextInt();

        int numeroDias;
        numeroDias = (idadeAno*365) + (idadeMes*30) + idadeDia;

        System.out.println("Com " +idadeAno+ " anos, " +idadeMes+ " meses e com " +idadeDia+ " dias seu tempo de vida corresponde a " +numeroDias+ " dias desde o nascimento.");
        sc.close();
    }
}
