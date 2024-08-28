/*
 * Contagem Regressiva para uma Data Específica
 * Descrição: Crie um programa que receba uma data futura e exiba 
 * quantos dias faltam até essa data. Caso a data já tenha passado, 
 * o programa deve exibir uma mensagem informando que a data já passou.
 */

package Exerc_Biblioteca_Time;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class exerc029 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um data de evento para saber quantos dias falta. \nInforme a data no formato - yyyy/mm/dd - 2025/04/17.");
        String dataEvento = sc.nextLine();
        sc.close();

        DateTimeFormatter formatacao = DateTimeFormatter.ofPattern("yyyy/MM/dd");

        LocalDate diaEvento = LocalDate.parse(dataEvento, formatacao);
        LocalDate diaAtual = LocalDate.now();

        if (diaEvento.isBefore(diaAtual)){
            System.out.println("A data do evento informada já se passou.");
        }else{
            long dias = ChronoUnit.DAYS.between(diaAtual, diaEvento);
            System.out.println("Ainda faltam " +dias+ " dias para o evento acontecer.");
        }
    }
    
}
