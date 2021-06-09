import java.util.Scanner;

public class Ejercicio18Java{
    static Scanner leer = new Scanner(System.in);

    public static void main (String[] args){
        
        String d1 = "";
        String d2 = "";
        String d3 = "";
        String d4 = "";
        String numero = "";
        int numeroEntero;

        numeroEntero = getInt("Ingrese un número");
        numero = "" + numeroEntero;

        if(numeroEntero < 10000){
            if(numeroEntero < 1000){
                if(numeroEntero < 100){
                    if(numeroEntero < 10){
                        d1 = "0";
                        d2 = "0";
                        d3 = "0";
                        d4 = numero.substring(0,1);
                    }
                    else{
                        d1 = "0";
                        d2 = "0";
                        d3 = numero.substring(0,1);
                        d4 = numero.substring(1,2);
                    }
                }
                else{
                    d1 = "0";
                    d2 = numero.substring(0,1);
                    d3 = numero.substring(1,2);
                    d4 = numero.substring(2,3);
                }
            }
            else{
                d1 = numero.substring(0,1);
                d2 = numero.substring(1,2);
                d3 = numero.substring(2,3);
                d4 = numero.substring(3,4);
            }
            
        }
        else{
            System.out.println("El número es mayor a 4 dígitos");
        }

        System.out.println("El primer dígito es "+ d1 + " El segundo dígito es " + d2 + " El tercer dígito es " + d3 + " El cuarto dígito es " + d4);
            
        
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