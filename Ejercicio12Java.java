import java.util.Scanner;

public class Ejercicio12Java{
    static Scanner leer = new Scanner(System.in);
    public static void main (String[] args){
        int celcius;
        double fahrenheit;

        celcius = getInt("Ingrese los grados celcius");
        fahrenheit = (celcius * 9/5) + 32;
        System.out.println("La temperatura en grados Fahrenheit es de " + fahrenheit);

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