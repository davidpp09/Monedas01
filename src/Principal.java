
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;

        do {
            Menu.exibirMenu();
            opcion = entrada.nextInt();
            entrada.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1 -> DiccionarioDivisas.mostrarDivisas();
                case 2 -> {
                    System.out.print("Ingresa el código de la divisa destino (ej. USD): ");
                    String destino = entrada.nextLine().toUpperCase();
                    System.out.print("Ingresa la cantidad en MXN: ");
                    int cantidad = entrada.nextInt();
                    Peticiones.conversionDeDivisas("MXN", destino, cantidad);
                }
                case 3 -> {
                    System.out.print("Ingresa el código de la divisa origen (ej. USD): ");
                    String origen = entrada.nextLine().toUpperCase();
                    System.out.print("Ingresa la cantidad a convertir: ");
                    int cantidad = entrada.nextInt();
                    Peticiones.conversionDeDivisas(origen, "MXN", cantidad);
                }
                case 4 -> {
                    System.out.print("Ingresa el código de la divisa origen: ");
                    String origen = entrada.nextLine().toUpperCase();
                    System.out.print("Ingresa el código de la divisa destino: ");
                    String destino = entrada.nextLine().toUpperCase();
                    System.out.print("Ingresa la cantidad: ");
                    int cantidad = entrada.nextInt();
                    Peticiones.conversionDeDivisas(origen, destino, cantidad);
                }
                case 5 -> System.out.println("¡Hasta luego!");
                default -> System.out.println("Opción inválida. Intenta de nuevo.");
            }

        } while (opcion != 5);
    }
}
