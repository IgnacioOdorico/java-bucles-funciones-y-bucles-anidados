/*Ejercicio 5: Cálculo de horas extras
Una empresa desea calcular las horas extras trabajadas por sus empleados. Si un empleado trabaja más de 40 horas en la semana, las horas adicionales se consideran horas extras.
Instrucciones:
•	Pide al usuario ingresar el número de empleados.
•	Usa un bucle para ingresar las horas trabajadas por cada empleado.
•	Si un empleado trabajó más de 40 horas, calcula y muestra las horas extras
*/
import java.util.Scanner;
public class eje5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de empleados: ");
        int empleados = scanner.nextInt();
        int empleado = 1;

        do {
            System.out.print("Horas trabajadas por el empleado " + empleado + ": ");
            int horas = scanner.nextInt();

            if (horas > 40) {
                int horasExtras = horas - 40;
                System.out.println("El empleado " + empleado + " trabajó " + horasExtras + " horas extras.");
            } else {
                System.out.println("El empleado " + empleado + " no trabajó horas extras.");
            }

            empleado++;
        } while (empleado <= empleados);

        scanner.close();
    }
}
