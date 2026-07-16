import java.util.Random;

public class Ejercicio11 {

    public static void main(String[] args) {

        Random random = new Random();

        int dado;
        int vecesSale1;
        int lanzamientos;

        vecesSale1 = 0;
        lanzamientos = 1;

        while (lanzamientos <= 50) {

            dado = random.nextInt(6) + 1; // Genera un número entre 1 y 6

            if (dado == 1) {
                vecesSale1 = vecesSale1 + 1;
            }

            lanzamientos = lanzamientos + 1;
        }

        System.out.println("El número de veces que salió el 1 fue: " + vecesSale1);
    }
}