import java.util.Scanner;

public class Ejercicio5Java{
    static Scanner leer = new Scanner(System.in);

    public static void main (String[] args){
        int var;
        int siguiente;
        var = getInt("Ingrese un número");
        siguiente = var + 1;
        System.out.println("El número siguiente es: " + siguiente);
    }

    public static int getInt(String titulo){
        String n = "";

        while(n.equals("")){
            System.out.println(titulo);
            n = leer.nextLine();
            if(!n.matches("[0-9]*$")){
                n = "";
            }
        }
        
        return Integer.parseInt(n);
    }
}