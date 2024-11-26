/*Ejercicio 7: Descuento por compras grandes*/
public class eje7_3 {
    public static void main(String[] args) {
        double[] compras = {200.0, 550.0, 300.0, 800.0, 450.0};

        aplicarDescuento(compras, 15);
    }

    public static void aplicarDescuento(double[] compras, int descuento) {
        System.out.println("Cálculo de descuentos:");
        for (double compra : compras) {
            if (compra > 500) {
                double nuevoPrecio = compra - (compra * descuento / 100);
                System.out.println("Compra: $" + compra + " - Precio con descuento: $" + nuevoPrecio);
            }
        }
    }
}
