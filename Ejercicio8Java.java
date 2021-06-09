import java.util.Scanner;

public class Ejercicio8Java{
    static Scanner leer = new Scanner(System.in);

    public static void main (String[] args){
        int var1;
        int var2;
        int var3;
        double promedio;
        var1 = getInt("Ingrese primer número");
        var2 = getInt("Ingrese segundo número");
        var3 = getInt("Ingrese tercer número");
        promedio = var1 + var2 + var3;
        System.out.println("El promedio de los números ingresados es: " + promedio);
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