/*
 * Verifique se o Ano é Bissexto
 * Escreva um programa que solicite ao usuário um ano e verifique se esse ano é bissexto.
 */

package Exerc_Biblioteca_Time;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit; // Importação específica para ChronoUnit
import java.util.Scanner; 

public class exerc024 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o ano para verificação de ano bissexto: ");
        int anoAtual = sc.nextInt();
        sc.close();
        
        LocalDate dataInicial = LocalDate.of(anoAtual, Month.JANUARY, 1);
        LocalDate dataFinal = LocalDate.of(anoAtual, Month.DECEMBER, 31);

        long qtdeDias = ChronoUnit.DAYS.between(dataInicial, dataFinal) + 1; // +1 para incluir o último dia
        



        if (qtdeDias == 366){
            System.out.println("O ano de " +anoAtual+ " é bissexto.");
        }else{
            System.out.println("O ano de " +anoAtual+ " não é bissexto.");
        }
    }
    
}
