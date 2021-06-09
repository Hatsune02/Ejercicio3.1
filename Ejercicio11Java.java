import java.util.Scanner;

public class Ejercicio11Java{
    static Scanner leer = new Scanner(System.in);

    public static void main (String[] args){
        int cm;
        double yardas;
        double metros;
        double pies;
        double pulgadas;

        cm = getInt("Ingrese medida en centimetros");
        yardas = cm / 91.44;
        metros = cm / 100;
        pies = cm / 30.46;
        pulgadas = cm / 2.54;

        System.out.println("El numero en cm es: " + cm + ", en yardas " + yardas + ", en metros " + metros + ", en pies " + pies +" y en pulgadas" + pulgadas);
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