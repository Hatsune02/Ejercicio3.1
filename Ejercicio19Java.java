import java.util.Random;

public class Ejercicio19Java{
    public static void main (String[] args){
        Random aleatorio = new Random();
        int random;
        int total;
        random = aleatorio.nextInt(1000 - 1);
        if(random % 5 == 0){
            total = random / 5;
            if(total < (25*25)){
                System.out.println("El número es: " + random);
                System.out.println("Es multiplo de 5 y está en los primeros números");
            }
            else{
                System.out.println("El número es: " + random);
                System.out.println("Es multiplo de 5, pero no está en los primeros números");
            }
        }
        else{
            System.out.println("El número es: " + random);
            System.out.println("No es multiplo de 5");
        }
    }

}