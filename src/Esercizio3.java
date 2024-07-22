public class Esercizio3 {
    public static void main(String[] args) {
        double lato1 = 5.2;
        double lato2 = 3.7;
        double perimetro = perimetroRettangolo(lato1, lato2);
        System.out.println("il perimetro del triangolo con lato1: " + lato1 + ", lato2: " + lato2 + ", è " + perimetro);

        System.out.println("-----------------------------METODO PARI-DISPARI-------------------------");

        int numeroPari = 4;
        int numeroDispari = 7;

        System.out.println("Il numero " + numeroPari + " è " + pariDispari(numeroPari));
        System.out.println("Il numero " + numeroDispari + " è " + pariDispari(numeroDispari));
    }

    //metodo che calcola il perimetro di un rettangolo inserendo i 2 lati
    public static double perimetroRettangolo(double lato1, double lato2) {
        double perimetro = 2 * (lato1 + lato2);
        return perimetro;
    }

    public static int pariDispari(int numero) {
        // Controlla se il numero è pari
        if (numero % 2 == 0) {
            return 0; // Restituisce 0 se il numero è pari
        } else {
            return 1; // Restituisce 1 se il numero è dispari
        }
    }
}
