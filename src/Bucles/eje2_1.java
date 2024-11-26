/*Ejercicio 2: Cálculo de salarios semanales
Una empresa desea calcular el salario semanal de sus empleados basándose en las horas trabajadas y una tarifa fija por hora.
Instrucciones:
•Pide al usuario ingresar la cantidad de empleados.
•Para cada empleado, pide ingresar las horas trabajadas.
•Usa un bucle para calcular el salario de cada empleado (suponiendo una tarifa fija de $15 por hora).
*/
import java.util.Scanner;

public class eje2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int TARIFA_HORA = 15;

        System.out.print("¿Cuántos empleados tiene la empresa? ");
        int empleados = scanner.nextInt();
        int empleado = 1;

        while (empleado <= empleados) {
            System.out.print("Ingrese las horas trabajadas por el empleado " + empleado + ": ");
            int horasTrabajadas = scanner.nextInt();
            int salario = horasTrabajadas * TARIFA_HORA;
            System.out.println("El salario del empleado " + empleado + " es: $" + salario);
            empleado++;
        }

        scanner.close();
    }
}
