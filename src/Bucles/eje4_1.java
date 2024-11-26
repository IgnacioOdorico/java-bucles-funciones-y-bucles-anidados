/*Ejercicio 4: Registro de ventas diarias
Una tienda desea registrar las ventas realizadas cada día durante una semana. El programa debe calcular el total de ventas al final de la semana.
Instrucciones:
•	Usa un bucle para registrar las ventas diarias durante 7 días.
•	Al final del bucle, muestra el total de ventas de la semana.
*/
import java.util.Scanner;
public class eje4_1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalVentas = 0;

        for (int dia = 1; dia <= 7; dia++) {
            System.out.print("Ingrese las ventas del día " + dia + ": ");
            totalVentas += scanner.nextInt();
        }

        System.out.println("El total de ventas de la semana es: $" + totalVentas);
        scanner.close();
    }
}
