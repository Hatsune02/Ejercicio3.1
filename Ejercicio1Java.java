import java.util.Scanner;

public class Ejercicio1Java{

    static Scanner leer = new Scanner(System.in);

    public static void main (String[] args){
        int var1 = 0;
        int var2=0;  
        int total=0;
        var1 = getInt("Digite el primer número");
        var2 = getInt("Digite el segundo número");

        total = var1 + var2;
        System.out.println("La suma de los números es; " + total);
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
