/*
 * Cálculo de Intervalo Entre Duas Datas
 * Descrição: Crie um programa que receba duas datas e 
 * calcule o número total de dias, semanas e meses entre elas.
 */

package Exerc_Biblioteca_Time;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class exerc030 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe duas datas no seguinte formato. \nYYYY/MM/DD - 2011/08/12");
        System.out.println("Digite a primeira data: ");
        String primeiraData = sc.nextLine();
        System.out.println("Digite a segunda data: ");
        String segundaData = sc.nextLine();
        sc.close();

        DateTimeFormatter formatacao = DateTimeFormatter.ofPattern("yyyy/MM/dd");
       
        LocalDate data1 =LocalDate.parse(primeiraData, formatacao);
        LocalDate data2 =LocalDate.parse(segundaData, formatacao);

        long dias = ChronoUnit.DAYS.between(data1, data2);
        long semanas = ChronoUnit.WEEKS.between(data1, data2);
        Period periodo = Period.between(data1, data2);
        int anos = periodo.getYears();
        int meses = periodo.getYears() * 12 + periodo.getMonths();

        System.out.println("Intervalo entre as datas:");
        System.out.println("Total de dias: " + dias);
        System.out.println("Total de semanas: " + semanas);
        System.out.println("Total de meses: " + meses);
        System.out.println("Total de anos: " + anos);

    }
    
}
