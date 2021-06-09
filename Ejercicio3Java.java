import java.util.Scanner;

public class Ejercicio3Java{
    static Scanner leer = new Scanner(System.in);

    public static void main (String[] args){
        int var;
        int doble;
        int triple;
        var = getInt("Ingrese un número");
        doble = var * 2;
        triple = var * 3;
        System.out.println("El doble del número es: " + doble + " y el triple es: " + triple);
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