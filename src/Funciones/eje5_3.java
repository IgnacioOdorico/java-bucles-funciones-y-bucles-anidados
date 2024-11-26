/*Ejercicio 5: Promedio de satisfacción del cliente*/
public class eje5_3 {
    public static void main(String[] args) {
        int[] calificaciones = {5, 4, 3, 4, 5, 2, 3, 4, 5, 5};

        double promedio = calcularPromedioSatisfaccion(calificaciones);
        System.out.println("El promedio de satisfacción del cliente es: " + promedio);
    }

    public static double calcularPromedioSatisfaccion(int[] calificaciones) {
        double suma = 0;
        for (int calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }
}
