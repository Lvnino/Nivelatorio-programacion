import java.util.Scanner;

public class Ejercicio8 {

    // Función para calcular el interés total
    public static double interesTotal(double montoPrestamo, int numeroDeMeses, double interesMensual) {

        interesMensual = interesMensual / 100;

        double resultadoInteresTotal = montoPrestamo * numeroDeMeses * interesMensual;

        return resultadoInteresTotal;
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double montoPrestamo;
        double valorTotalAPagar;
        double interesMensual;
        int numeroDeMeses;

        System.out.print("Ingresa el monto del préstamo (capital): ");
        montoPrestamo = entrada.nextDouble();

        System.out.print("Ingresa el número de meses del préstamo: ");
        numeroDeMeses = entrada.nextInt();

        System.out.print("Ingrese el interés mensual en porcentaje: ");
        interesMensual = entrada.nextDouble();

        valorTotalAPagar = montoPrestamo +
                interesTotal(montoPrestamo, numeroDeMeses, interesMensual);

        System.out.println("El valor total a pagar es: $" + valorTotalAPagar);

        entrada.close();
    }
}