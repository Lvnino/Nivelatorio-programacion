import java.util.Scanner;

public class Taller2_6 {

    public static void factoresPrimos(int numero) {

        int factor = 2;

        if (numero < 1) {
            System.out.println("Número inválido. Ingrese un número mayor que 1");
        } else {

            System.out.print("La descomposición en factores primos del número " + numero + " es: ");

            while (numero > 1) {

                if (numero % factor == 0) {

                    numero /= factor;

                    if (numero == 1) {
                        System.out.println(factor);
                    } else {
                        System.out.print(factor + " x ");
                    }

                } else {

                    factor++;

                }

            }

        }
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = entrada.nextInt();

        factoresPrimos(numero);

        entrada.close();
    }
}