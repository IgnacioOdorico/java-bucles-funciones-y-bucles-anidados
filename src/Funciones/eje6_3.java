/*Ejercicio 6: Cálculo de impuestos*/
public class eje6_3 {
    public static void main(String[] args) {
        double[] facturas = {500.0, 750.0, 1200.0, 300.0, 450.0};

        calcularImpuesto(facturas, 21);
    }

    public static void calcularImpuesto(double[] facturas, int tasa) {
        System.out.println("Cálculo de impuestos:");
        for (double factura : facturas) {
            double impuesto = factura * tasa / 100;
            System.out.println("Factura: $" + factura + " - Impuesto: $" + impuesto);
        }
    }
}
