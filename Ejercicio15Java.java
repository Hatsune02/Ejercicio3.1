import java.util.Scanner;

public class Ejercicio15Java{
    static Scanner leer = new Scanner(System.in);

    public static void main (String[] args){
        int var;

        var = getInt("Ingrese un número");

        if(var != 0){
            if(var > 0){
                System.out.println("El número es positivo");
            }
            else {
                System.out.println("El número es negativo");
            }
            
        }  
        else{
            System.out.println("El número es nulo");
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