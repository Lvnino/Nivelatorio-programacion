import java.util.Random;

public class Taller2_11 {

    public static void lanzarDado() {

        Random random = new Random();

        int dado;
        int cantidadDeUno = 0;
        int lanzamientos = 1;

        while (lanzamientos <= 50) {

            dado = random.nextInt(6) + 1;

            if (dado == 1) {
                cantidadDeUno = cantidadDeUno + 1;
            }

            lanzamientos = lanzamientos + 1;
        }

        System.out.println("La cantidad de unos obtenidos fue: " + cantidadDeUno);
    }

    public static void main(String[] args) {

        lanzarDado();

    }
}