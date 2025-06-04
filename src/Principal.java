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
            case 1 -> Peticiones.conversionDeDivisas("USD", "ARS", cantidad);
            case 2 -> Peticiones.conversionDeDivisas("ARS", "USD", cantidad);
            case 3 -> Peticiones.conversionDeDivisas("USD", "BRL", cantidad);
            case 4 -> Peticiones.conversionDeDivisas("BRL", "USD", cantidad);
            case 5 -> Peticiones.conversionDeDivisas("USD", "COP", cantidad);
            case 6 -> Peticiones.conversionDeDivisas("COP", "USD", cantidad);
        }
    }
}
