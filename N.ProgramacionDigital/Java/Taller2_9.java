public class Taller2_9 {

    public static void imprimirColumnas() {

        int columna1 = 1;
        int columna2 = 100;

        while (columna1 <= 100) {

            System.out.println(columna1 + "     " + columna2);

            columna1 = columna1 + 1;
            columna2 = columna2 - 1;

        }

    }

    public static void main(String[] args) {

        imprimirColumnas();

    }
}