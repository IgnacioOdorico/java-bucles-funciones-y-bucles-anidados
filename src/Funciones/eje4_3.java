/*Ejercicio 4: Cálculo de descuentos para fidelización*/
public class eje4_3 {
    public static void main(String[] args) {
        String[] clientes = {"Juan", "María", "Carlos", "Ana", "Pedro"};
        int[] compras = {12, 8, 15, 10, 20};

        calcularDescuentos(clientes, compras);
    }

    public static void calcularDescuentos(String[] clientes, int[] compras) {
        System.out.println("Clientes que califican para descuento:");
        for (int i = 0; i < clientes.length; i++) {
            if (compras[i] > 10) {
                System.out.println(clientes[i] + " recibe un descuento del 10% por fidelización.");
            }
        }
    }
}
