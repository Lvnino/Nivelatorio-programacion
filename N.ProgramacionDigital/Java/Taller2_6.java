import java.util.Scanner;

public class Taller2_6 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numeroUsuario;
        int factorPrimo = 2;
        String numeroImprimir = "";

        System.out.print("Ingrese un número: ");
        numeroUsuario = entrada.nextInt();

        if (numeroUsuario < 1) {
            System.out.println("Número inválido. Ingrese un número mayor que 1");
        } else {

            System.out.print("La descomposición en factores primos del número " + numeroUsuario + " es: ");

            while (numeroUsuario > 1) {

                if (numeroUsuario % factorPrimo == 0) {
                    numeroUsuario = numeroUsuario / factorPrimo;

                    if (numeroUsuario == 1) {
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