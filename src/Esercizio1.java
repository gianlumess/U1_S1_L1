import java.util.Arrays;

public class Esercizio1 {
    public static void main(String[] args) {
        System.out.println("-----------METODO MOLTIPLICA---------");
        int result = mol(4, 6);
        System.out.println("il risultato della moltiplicazione è: " + result);

        System.out.println("-------------------METODO CONCAT--------------");
        String unioneStringaIntero = concat("hi, my name is Gianluca and I'm ", 23);
        System.out.println(unioneStringaIntero);
        System.out.println("-------------------METODO ARRAY-----------------");
        String[] arrayIniaziale = {"A", "B", "C", "D", "E"};
        String stringaDaInserire = "XY";
        String[] arrayNuovo = inserisciInArray(arrayIniaziale, stringaDaInserire);
        Arrays.stream(arrayNuovo).forEach(System.out::println);
        
    }

    public static int mol(int num1, int num2) {
        //metodo che moltiplica 2 numeri interi
        return num1 * num2;
    }

    public static String concat(String stringa, int num) {
        return stringa + num;
    }

    public static String[] inserisciInArray(String[] array, String stringa) {
        //controllo se l'array contiene effettivamente 5 elementi
        if (array == null || array.length != 5) {
            throw new IllegalArgumentException("l'array deve contenere 5 elementi");
        }

        String[] newArray = new String[6];

        newArray[0] = array[0];
        newArray[1] = array[1];

        newArray[2] = stringa;

        newArray[3] = array[2];
        newArray[4] = array[3];
        newArray[5] = array[4];

        return newArray;
    }
}
