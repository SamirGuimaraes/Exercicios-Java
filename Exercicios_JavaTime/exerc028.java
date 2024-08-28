/*
 * Calcular a Idade de uma Pessoa
 * Descrição: Crie um programa que solicite ao usuário a data de nascimento 
 * no formato yyyy-MM-dd e calcule a idade exata da pessoa em anos e meses.
 */

package Exerc_Biblioteca_Time;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class exerc028 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe sua data de nascimento da seguinte forma -yyyy/mm/dd: 2005/11/28");
        String dataNascimento = sc.nextLine();
        sc.close();

        DateTimeFormatter formatacao = DateTimeFormatter.ofPattern("yyyy/MM/dd");

        LocalDate dataAtual = LocalDate.now();
        LocalDate nascimento = LocalDate.parse(dataNascimento, formatacao);

        Period periodo = Period.between(nascimento, dataAtual);
        int anos = periodo.getYears();
        int meses = periodo.getMonths();
        long dias = periodo.getDays();

        System.out.println("Você tem " +anos+ " anos e " +meses+ " meses " +dias+ " e dias de vidas.");
        


    }
    
}
