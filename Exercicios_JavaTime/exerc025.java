/*
 * Este programa deseja ao usuário Bom-Dia, Boa-Tarde ou Boa-Noite
 * com base na hora atual do sistema.
 */

package Exerc_Biblioteca_Time;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class exerc025 {
    
    public static void main(String[] args) {

        LocalTime horaAtual = LocalTime.now();

        float horaFormatada = horaAtual.getHour();

        if (horaFormatada >= 0.00 && horaFormatada < 12.00){
            System.out.println(" Bom Dia!");

        }else if (horaFormatada >= 12.00 && horaFormatada < 18.00){
            System.out.println("Boa Tarde!");

        }else {
            System.out.println("Boa Noite!");

        }
        
    }
    
}
