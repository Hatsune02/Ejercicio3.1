import java.util.Scanner;

public class Ejercicio16Java{
    static Scanner leer = new Scanner(System.in);

    public static void main (String[] args){
        int var1;
        int var2;
        int var3;
        var1 = getInt("Ingrese primer número");
        var2 = getInt("Ingrese segundo número");
        var3 = getInt("Ingrese tercer número");

        if(var1 > var2){
            if(var1 > var3){
                System.out.println("El numero mayor es " + var1);
            }
            else{
                System.out.println("El numero mayor es " + var3);
            }
        }
        else{
            if(var2 > var3){
                System.out.println("El numero mayor es " + var2);
            }
            else{
                System.out.println("El numero mayor es " + var3);
            }
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