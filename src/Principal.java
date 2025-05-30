import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;

        do {
            Menu.exibirMenu();
            opcion = entrada.nextInt();

            if (opcion >= 1 && opcion <= 6) {
                System.out.print("Ingresa la cantidad a convertir: ");
                int cantidad = entrada.nextInt();
                conver(opcion, cantidad);
            } else if (opcion == 7) {
                System.out.println("¡Hasta luego!");
            } else {
                System.out.println("Opción inválida");
            }
        } while (opcion != 7);
    }

    public static void conver(int opcion, int cantidad) {
        switch (opcion) {
            case 1 -> Peticiones.conversion("USD", "ARS", cantidad);
            case 2 -> Peticiones.conversion("ARS", "USD", cantidad);
            case 3 -> Peticiones.conversion("USD", "BRL", cantidad);
            case 4 -> Peticiones.conversion("BRL", "USD", cantidad);
            case 5 -> Peticiones.conversion("USD", "COP", cantidad);
            case 6 -> Peticiones.conversion("COP", "USD", cantidad);
        }
    }
}
