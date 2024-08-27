/*
 * Calcule a Data de Uma Semana Anterior
 * Crie um programa que exiba a data atual e a data correspondente a exatamente uma semana antes da data atual.
 */

package Exerc_Biblioteca_Time;
import java.time.*;

public class exerc023 {
    public static void main(String[] args) {
        
        LocalDate dataAtual = LocalDate.now();
        LocalDate dataAlterada = LocalDate.now().minusDays(7);

        System.out.println("Data Atual: " +dataAtual);
        System.out.println("Uma semana atrás: " +dataAlterada);
    }

}
