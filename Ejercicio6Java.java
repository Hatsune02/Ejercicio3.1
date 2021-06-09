import java.util.Random;

public class Ejercicio6Java{
    public static void main (String[] args){
        Random aleatorio = new Random();
        int random;
        double aumento;
        random = aleatorio.nextInt(50 - 10);
        aumento = random * 1.3;
        System.out.println("El número al azar es: " + random + " y aumentado un 30% es: " + aumento);
    }

}