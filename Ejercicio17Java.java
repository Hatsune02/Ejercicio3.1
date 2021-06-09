import java.util.Scanner;

public class Ejercicio17Java{
    static Scanner leer = new Scanner(System.in);

    public static void main (String[] args){
        int lado1;
        int lado2;
        int lado3;
        lado1 = getInt("Ingrese primer lado");
        lado2 = getInt("Ingrese segundo lado");
        lado3 = getInt("Ingrese tercer lado");

        if(lado1 == lado2){
            if(lado1 == lado3){
                System.out.println("El triángulo es equilátero ");
            }
            else{
                System.out.println("El triángulo es isósceles ");
            }
        }
        else{
            if(lado2 == lado3){
                System.out.println("El triángulo es isósceles ");
            }
            else{
                if(lado1 == lado3){
                    System.out.println("El triángulo es isósceles ");
                }
                else{
                    System.out.println("El triángulo es escaleno ");
                }
                
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