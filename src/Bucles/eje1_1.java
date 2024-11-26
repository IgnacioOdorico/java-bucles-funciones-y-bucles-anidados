/*Ejercicio 1: Cálculo del tiempo dedicado a cada actividad
Un alumno quiere medir el tiempo total que dedica a sus actividades académicas y personales durante el día.
Instrucciones:
•	Pide al usuario que ingrese las horas dedicadas a cada actividad: estudiar, hacer ejercicios, leer, y tiempo libre.
•	Usa un bucle para registrar las horas y luego calcula el tiempo total dedicado
*/
import java.util.Scanner;

public class eje1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] actividades = {"estudiar", "hacer ejercicios", "leer", "tiempo libre"};
        int totalHoras = 0;
        int i = 0;

        while (i < actividades.length) {
            System.out.print("¿Cuántas horas dedicas a " + actividades[i] + "? ");
            totalHoras += scanner.nextInt();
            i++;
        }

        System.out.println("El tiempo total dedicado a todas las actividades es: " + totalHoras + " horas.");
        scanner.close();
    }
}
