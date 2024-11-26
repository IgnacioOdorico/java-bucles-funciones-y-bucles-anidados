/*Ejercicio 9: Calcular el precio final con descuentos*/
public class  eje9_3{
    public static void main(String[] args) {
        double[] preciosOriginales = {100.0, 200.0, 300.0, 400.0, 500.0};

        calcularPrecioFinal(preciosOriginales, 10);
    }

    public static void calcularPrecioFinal(double[] precios, int descuento) {
        System.out.println("Precios con descuento:");
        for (double precio : precios) {
            double precioFinal = precio - (precio * descuento / 100);
            System.out.println("Precio original: $" + precio + " - Precio final: $" + precioFinal);
        }
    }
}
