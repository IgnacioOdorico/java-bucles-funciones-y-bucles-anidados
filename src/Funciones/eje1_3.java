/*Ejercicio 1: Cálculo de ingresos mensuales*/
public class eje1_3 {
    public static void main(String[] args) {
        double[] ventas = {200.5, 150.0, 320.0, 100.0, 240.5, 300.0, 400.0, 180.0, 220.5, 190.0, 270.0, 310.0, 180.0, 150.5, 210.0,
                250.0, 280.0, 330.0, 390.0, 260.0, 270.0, 300.0, 310.0, 350.0, 200.0, 220.0, 400.0, 450.0, 150.0, 230.0};

        double totalIngresos = calcularIngresosMensuales(ventas);
        System.out.println("El total de ingresos mensuales es: $" + totalIngresos);
    }

    public static double calcularIngresosMensuales(double[] ventas) {
        double total = 0;
        for (double venta : ventas) {
            total += venta;
        }
        return total;
    }
}
