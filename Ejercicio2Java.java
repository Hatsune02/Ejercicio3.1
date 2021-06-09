import java.util.Scanner;

public class Ejercicio2Java{
    static Scanner leer = new Scanner(System.in);

    public static void main (String[] args){
        String pais;
        String capital;
        pais = getString("Ingrese el nombre de un país");
        capital = getString("Ingrese el nombre de la capital del país antes escrito");
        System.out.println(capital + " es la capital de " + pais);
    }

    public static String getString(String titulo){
        String n = "";

        while(n.equals("")){
            System.out.println(titulo);
            n = leer.nextLine();
            if(!n.matches("^[A-Za-z ]*$")){
                n = "";
            }
        }
        return n;
    }
}