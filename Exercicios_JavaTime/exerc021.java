/*
 * Obtenha a Data e Hora Atuais
 * Crie um programa que exiba a data e hora atuais no console.
 */

package Exerc_Biblioteca_Time;
import java.time.*;


public class exerc021 {
    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("A data e hora atual corresponde a \n" +ldt);
        
    }
}
