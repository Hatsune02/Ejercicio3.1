import java.util.Scanner;

public class Ejercicio4Java{

    static Scanner leer = new Scanner(System.in);

    public static void main (String[] args){
        int var;
        int cuadrado;
        int cubo;
        var = getInt("Ingrese un número");
        cuadrado = var * var;
        cubo = var * var * var;
        System.out.println("El cuadrado del número es: " + cuadrado + " y el cubo es: " + cubo);
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