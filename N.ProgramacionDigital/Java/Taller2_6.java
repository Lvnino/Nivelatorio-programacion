import java.util.Scanner;

public class Taller2_6 {

    public static void factoresPrimos() {

        Scanner entrada = new Scanner(System.in);

        int numero;
        int factor = 2;

        System.out.print("Ingrese un número: ");
        numero = entrada.nextInt();

        if (numero < 1) {

            System.out.println("Número inválido. Ingrese un número mayor que 1");

        } else {

            System.out.print("La descomposición en factores primos del número " + numero + " es: ");

            while (numero > 1) {

                if (numero % factor == 0) {

                    numero = numero / factor;

                    if (numero == 1) {
                        System.out.println(factor);
                    } else {
                        System.out.print(factor + " x ");
                    }

                } else {

                    factor = factor + 1;

                }

            }

        }

        entrada.close();

    }

    public static void main(String[] args) {

        factoresPrimos();

    }
}