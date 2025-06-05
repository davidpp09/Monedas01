public class OperacionConversion {
    private String origen;
    private String destino;
    private double cantidad;

    // Constructor 1: todos los datos
    public OperacionConversion(String origen, String destino, double cantidad) {
        this.origen = origen;
        this.destino = destino;
        this.cantidad = cantidad;
    }

    // Constructor 2: sin cantidad (por defecto 0)
    public OperacionConversion(String origen, String destino) {
        this(origen, destino, 0);
    }

    // Constructor 3: solo con origen (destino = USD por defecto)
    public OperacionConversion(String origen) {
        this(origen, "USD", 0);
    }
}
