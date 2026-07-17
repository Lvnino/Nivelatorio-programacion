import java.util.Scanner;

public class Taller2_8 {

    public static double interes(double monto, int meses, double porcentaje) {

        porcentaje = porcentaje / 100;

        return monto * meses * porcentaje;
    }

    public static void calcularPrestamo() {

        Scanner entrada = new Scanner(System.in);

        double monto;
        double porcentaje;
        double total;
        int meses;

        System.out.print("Ingrese el monto del préstamo: ");
        monto = entrada.nextDouble();

        System.out.print("Ingrese el número de meses: ");
        meses = entrada.nextInt();

        System.out.print("Ingrese el interés mensual (%): ");
        porcentaje = entrada.nextDouble();

        total = monto + interes(monto, meses, porcentaje);

        System.out.println("El valor total a pagar es: $" + total);

        entrada.close();

    }

    public static void main(String[] args) {

        calcularPrestamo();

    }
}