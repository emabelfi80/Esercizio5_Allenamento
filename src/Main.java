/**
 * Scrivere un programma che, dato un certo tempo in giorni, ore, minuti e secondi restituisca
 * il numero totale di secondi.
 * Sappiamo che un giorno ha 86400 secondi, un’ora ha 3600 secondi e un minuto 60 secondi.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Calcolo totale secondi");


        // Faccio inserire tramite scanner gli input di giorni, ore, minuti e secondi
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci il numero di giorni: ");
        int giorni = input.nextInt();
        System.out.print("Inserisci il numero di ore: ");
        int ore = input.nextInt();
        System.out.print("Inserisci il numero di minuti: ");
        int minuti = input.nextInt();
        System.out.print("Inserisci il numero di secondi: ");
        int secondi = input.nextInt();

        // Eseguo il calcolo totale
        int totale_secondi = giorni * 86400 + ore * 3600 + minuti * 60 + secondi;

        // MAndo risultato a stampa
        System.out.println("Il tempo totale in secondi è: " + totale_secondi);

    }
}
