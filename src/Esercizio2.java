import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        //creo l'oggetto scanner per chiedere degli input all'utente
        Scanner scanner = new Scanner((System.in));

        System.out.println("Ciao!! Scrivi il tuo nome");
        String nomeUtente = scanner.nextLine();

        System.out.println("Ciao" + " " + nomeUtente + ", adesso inserisci il tuo cognome:");
        String cognomeUtente = scanner.nextLine();

        System.out.println("perfetto! Così ti chiami " + nomeUtente + " " + cognomeUtente + ", adesso ho bisogno di sapere quanti hanni hai:");
        String etaUtente = scanner.nextLine();

        String datiOttenuti = concatInOrdine(nomeUtente, cognomeUtente, etaUtente);

        System.out.println(datiOttenuti);

        datiOttenuti = concatReverse(nomeUtente, cognomeUtente, etaUtente);
        System.out.println(datiOttenuti);
    }

    public static String concatInOrdine(String stringa1, String stringa2, String stringa3) {
        return stringa1 + " " + stringa2 + " " + stringa3;
    }

    public static String concatReverse(String stringa1, String stringa2, String stringa3) {
        return stringa3 + " " + stringa2 + " " + stringa1;
    }
}
