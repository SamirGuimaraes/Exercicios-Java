/*O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem 
* do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual 
* do distribuidor seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo 
* de fábrica de um carro, calcular e escrever o custo final ao consumidor 
*/

package ExerciciosJava;
import java.util.Scanner;

public class exerc014 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o preço de fábrica do carro para cálculo do preço final: ");
        float precoFabrica = sc.nextFloat();

        float precoFinal;
        precoFinal = (precoFabrica + (precoFabrica*0.28f) + (precoFabrica*0.45f));
        
        System.out.println("O preço final do carro para o consumidor será de R$" +precoFinal);

        sc.close();
    }
    
}
