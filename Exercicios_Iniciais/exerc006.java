/*
 * Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
números 4, 5 e 6. A soma das duas médias. A média das médias.
 */

package ExerciciosJava;

public class exerc006 {
    public static void main(String[] args) {
        float valor1, valor2, valor3, valor4, valor5, valor6, media1, media2, mediaFinal;

        valor1 = 9f;
        valor2 = 8f;
        valor3 = 7f;
        valor4 = 6f;
        valor5 = 5f;
        valor6 = 4f;

        media1 = (valor1 + valor2 + valor3)/3;
        media2 = (valor4 + valor5 + valor6)/3;

        mediaFinal = (media1 + media2)/2;

        System.out.println("A média aritmética dos números 7, 8 e 9 corresponde a " +media1);
        System.out.println("A média aritmética dos números 4,5 e 6 corresponde a " +media2);
        System.out.println("A média aritmética corresponde a " +mediaFinal);

    }
}
