import java.util.Scanner;

public class Ejercicio20Java{
    static Scanner leer = new Scanner(System.in);

    public static void main (String[] args){
        
        int d1;
        int d2;
        int d3;
        int d4;
        int d5;
        int numero;

        numero = getInt("Ingrese un número");

        if(numero < 100000 && numero > 9999){
            if(numero % 10 == 0){
                d5 = 0;
            }
            else{
                d5 = numero % 10;
                numero = numero - d5;
                d5 = d5 / 1;
            }

            if(numero % 100 == 0){
                d4 = 0;
            }
            else{
                d4 = numero % 100;
                numero = numero - d4;
                d4 = d4 / 10;
            }

            d3 = numero % 1000;
		    numero = numero - d3;

            if(numero % 10000 == 0){
                d2 = 0;
            }
            else{
                d2 = numero % 10;
                numero = numero - d2;
                d2 = d2 / 1000;
            }

            if(numero % 100000 == 0){
                d1 = 0;
            }
            else{
                d1 = numero % 10;
                numero = numero - d1;
                d1 = d1 / 10000;
            }

            if(d1 == d5 && d2 == d4){
                System.out.println("Es capicúa");
            }
            else{
                System.out.println("No es capicúa");
            }
        }
        else{

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