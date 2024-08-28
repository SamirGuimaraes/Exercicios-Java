/*
 * Este programa exibe a data e a hora atuais em três fusos horários distintos ao redor do mundo.
 * Utiliza a classe ZonedDateTime da biblioteca java.time para obter a data e a hora localizadas
 * em diferentes regiões, especificadas pelos identificadores de zona (ZoneId). O programa mostra
 * o fuso horário para Cairo (África), São Paulo (América do Sul) e Nova York (América do Norte).
 */

package Exerc_Biblioteca_Time;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class exerc027 {
    
    public static void main(String[] args) {

        ZoneId fuso1 = ZoneId.of("Africa/Cairo");
        ZonedDateTime fusoCairo = ZonedDateTime.now(fuso1);

        ZoneId fuso2 = ZoneId.of("America/Sao_Paulo");
        ZonedDateTime fusoSP = ZonedDateTime.now(fuso2);

        ZoneId fuso3 = ZoneId.of("America/New_York");
        ZonedDateTime fusoNY = ZonedDateTime.now(fuso3);

        System.out.println("Fuso horário de Cairo na África: \n" +fusoCairo);
        System.out.println("\nFuso horário de São Paulo na Ámerica do Sul: \n" +fusoSP);
        System.out.println("\nFuso horário de Nova York na Ámerica do Norte: \n" +fusoNY);
    
}

}
