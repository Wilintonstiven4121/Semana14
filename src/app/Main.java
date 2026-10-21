package app;

public class Main {


    static final double META_VENTAS = 500_000;

    public static void main(String[] args) {
        String[] productos = {"Hamburguesas", "Perros Calientes", "Papas Fritas"};
        String[] turnos = {"Almuerzo", "Tarde", "Noche", "Madrugada"};
        double[][] ventas = new double[productos.length][turnos.length];

        registrarVentas(ventas, productos, turnos);

        public static void registrarVentas ( double[][] ventas, String[] productos, String[]turnos){
            java.util.Scanner teclado = new java.util.Scanner(System.in);

            for (int i = 0; i < productos.length; i++) {
                System.out.println("\nIngrese las ventas de " + productos[i]);

                for (int j = 0; j < turnos.length; j++) {
                    ventas[i][j] = leerDatos(teclado, turnos[j]);
                }
            }
        }
        public static double leerDatos(java.util.Scanner teclado, String turno) {
            double valor;

            do {
                System.out.print(turno + ": $");
                valor = teclado.nextDouble();

                if (valor <= 0) {
                    System.out.println("El valor debe ser mayor que cero. Intente de nuevo.");
                }

            } while (valor <= 0);

            return valor;
    }
