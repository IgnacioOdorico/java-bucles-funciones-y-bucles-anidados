/*Ejercicio 3: Gestión de clientes*/
public class eje3_3{
    public static void main(String[] args) {
        String[] clientes = {"Juan", "María", "Carlos", "Ana", "Pedro"};
        double[] facturasPendientes = {400.0, 600.0, 150.0, 800.0, 300.0};

        enviarFacturas(clientes, facturasPendientes);
    }

    public static void enviarFacturas(String[] clientes, double[] facturasPendientes) {
        System.out.println("Clientes con facturas mayores a $500:");
        for (int i = 0; i < clientes.length; i++) {
            if (facturasPendientes[i] > 500) {
                System.out.println(clientes[i] + " - Factura: $" + facturasPendientes[i]);
            }
        }
    }
}

