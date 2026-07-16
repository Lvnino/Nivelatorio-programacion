import java.util.Scanner;

public class Taller2_6 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;
        int factorPrimo = 2;
        String numeroImprimir = "";

        System.out.print("Ingrese un número: ");
        numero = entrada.nextInt();

        if (numero < 1) {
            System.out.println("Número inválido. Ingrese un número mayor que 1");
        } else {

            System.out.print("La descomposición en factores primos del número " + numero + " es: ");

            while (numero > 1) {

                if (numero % factorPrimo == 0) {
                    numero = numero / factorPrimo;

                    if (numero == 1) {
                        System.out.println(factorPrimo);
                    } else {
                        System.out.print(factorPrimo + " x ");
                    }

                } else {
                    factorPrimo++;
                }

            }

        }

        entrada.close();
    }
}