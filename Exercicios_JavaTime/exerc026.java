/*
 * Formatação da data atual para data escrita 
 */

package Exerc_Biblioteca_Time;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class exerc026 {

    public static void main(String[] args) {
        
        LocalDate dataAtual = LocalDate.now();

        DateTimeFormatter formatandoData = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        String dataFormatada = formatandoData.format(dataAtual);

        System.out.println(dataFormatada);



    }
    
}
