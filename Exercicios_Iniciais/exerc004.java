/*
 * Faça um programa que leia a medida de raio de um círculo em metros,
determine e exiba o perímetro e a área desse círculo, considerando PI =
3.14159.

Perímetro = 2 * PI * raio
Área = PI * raio2
 */

package ExerciciosJava;
import java.util.Scanner;

public class exerc004 {
    public static void main(String[] args) {
        final float PI = 3.14159f;

        Scanner sc = new Scanner(System.in);

        System.out.println("informe o raio do círcuclo: ");
        float raio = sc.nextFloat();

        float perimetro, area;

        perimetro = 2*PI*raio;
        area = PI*raio*raio;
        // O conceito de Exponencial ainda não foi trabalhado.

        System.out.println("Com um raio correspondete a " +raio+ " metros temos as seguintes informações. \nPerímetro: " +perimetro+ "\nÁrea: " +area);
        sc.close();
    }
}
