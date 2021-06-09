import java.util.Scanner;

public class Ejercicio14Java{
    static Scanner leer = new Scanner(System.in);

    public static void main (String[] args){
        int dividendo;
        int divisor;

        dividendo = getInt("Ingrese el dividendo");
        divisor = getInt("Ingrese el divisor");

        if(divisor != 0){
            if(dividendo % divisor == 0){
                System.out.println("Si es divisible");
            }
            else {
                System.out.println("El primer número no es divisible entre el segundo número");
            }
            
        }
        else{
            System.out.println("Esponja!, enloqueciste!?");
        }
        
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