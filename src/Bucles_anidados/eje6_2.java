/*Ejercicio 6: Mostrar números primos desde 2 hasta N*/
import java.util.Scanner;

public class eje6_2{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese un número N: ");
            int N = scanner.nextInt();

            for (int num = 2; num <= N; num++) {
                boolean esPrimo = true;

                for (int i = 2; i <= Math.sqrt(num); i++) { // Verifica si es divisible
                    if (num % i == 0) {
                        esPrimo = false;
                        break;
                    }
                }

                if (esPrimo) {
                    System.out.println(num);
                }
            }

            scanner.close();
        }
    }
/*tnego dudas de q este bien jaja*/
