import java.util.Scanner;

public class Ejercicio9Java{
    static Scanner leer = new Scanner(System.in);

    public static void main (String[] args){
        String A;
        String B;
        String aux;
        A = getString("Ingrese una palabra");
        B = getString("Ingrese otra palabra");

        aux = A;
	    A = B;
	    B = aux;

        System.out.println("La primera palabra ahora es " + A + " y la segunda palabra ahora es" + B);
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