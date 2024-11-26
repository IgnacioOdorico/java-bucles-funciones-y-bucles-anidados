/*Ejercicio 8: Control de horas trabajadas*/
public class eje8_3{
    public static void main(String[] args) {
        String[] empleados = {"Juan", "María", "Carlos", "Ana", "Pedro"};
        int[] horasTrabajadas = {40, 35, 45, 50, 30};

        calcularPagoSemanal(empleados, horasTrabajadas, 15);
    }

    public static void calcularPagoSemanal(String[] empleados, int[] horas, int tarifa) {
        System.out.println("Pago semanal de los empleados:");
        for (int i = 0; i < empleados.length; i++) {
            int pago = horas[i] * tarifa;
            System.out.println(empleados[i] + " - Pago: $" + pago);
        }
    }
}
