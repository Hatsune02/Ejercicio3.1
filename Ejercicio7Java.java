import java.util.Random;

public class Ejercicio7Java{
    public static void main (String[] args){
        Random aleatorio = new Random();
        int random;
        double disminucion;
        random = aleatorio.nextInt(200 - 1);
        disminucion = random * 0.85;
        System.out.println("El número al azar es: " + random + " y disminuido un 15% es: " + disminucion);
    }

}