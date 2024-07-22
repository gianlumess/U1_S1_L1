public class Esercizio1 {
    public static void main(String[] args) {
        System.out.println("-----------METODO MOLTIPLICA---------");
        int result = mol(4, 6);
        System.out.println("il risultato della moltiplicazione è: " + result);

        System.out.println("-------------------METODO CONCAT--------------");
        String unioneStringaIntero = concat("hi, my name is Gianluca and I'm ", 23);
        System.out.println(unioneStringaIntero);
    }

    public static int mol(int num1, int num2) {
        //metodo che moltiplica 2 numeri interi
        return num1 * num2;
    }

    public static String concat(String stringa, int num) {
        return stringa + num;
    }
}
