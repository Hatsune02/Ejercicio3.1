import java.util.Scanner;

public class Ejercicio10Java{
    static Scanner leer = new Scanner(System.in);

    public static void main (String[] args){
        int base;
        int altura;
        int area;
        int perimetro;

        base = getInt("Ingrese la base");
        altura = getInt("Ingrese la altura");
        perimetro = 2*(base + altura);
        area = base * altura;

        System.out.println("El área del rectángulo es; " + area + " y el perímetro es: " + perimetro);
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