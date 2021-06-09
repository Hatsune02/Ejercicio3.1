import java.util.Scanner;

public class Ejercicio13Java{
    static Scanner leer = new Scanner(System.in);

    public static void main (String[] args){
        int radio;
        int altura;
        double volumen;
        double PI = 3.1416;
    

        radio = getInt("Ingrese el radio");
        altura = getInt("Ingrese la altura");

        if(radio > 0 && altura > 0){
            volumen = PI * radio * radio * altura;

            System.out.println("El área del rectángulo es; " + volumen);
        }
        else{
            System.out.println("Las medidas no son mayores a cero, no existen");
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