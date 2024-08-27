/*
 * Obtenha a Data e Hora Atuais
 * Este programa exibe a data atual e calcula uma nova data ao adicionar um número específico de dias, 
 * que é fornecido pelo usuário. Ele faz uso da classe `LocalDate` da biblioteca `java.time` para 
 * manipular datas, e da classe `Scanner` para obter a entrada do usuário.
 */

package Exerc_Biblioteca_Time;
import java.time.*;
import java.util.Scanner;

public class exerc022 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva quantos dias deseja inserir na data atual: ");
        int inserirDias = sc.nextInt();
        sc.close();

        LocalDate dataAtual = LocalDate.now();
        LocalDate dataAlterada = LocalDate.now().plusDays(inserirDias);

        System.out.println("A data atual corresponde a " +dataAtual+ ". \nInserindo " +inserirDias+ " dias a nova data corresponde a " +dataAlterada);
    }
    
}
