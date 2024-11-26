/*Ejercicio 3: Control de inventario
        Una tienda necesita revisar el inventario de sus productos y determinar si algún artículo tiene menos de 5 unidades disponibles para realizar un pedido.
        Instrucciones:
        •	Pide al usuario ingresar el número de productos.
        •	Usa un bucle para ingresar la cantidad disponible de cada producto.
        •	Si algún producto tiene menos de 5 unidades, muestra un mensaje indicando que es necesario realizar un pedido.*/
import java.util.Scanner;

public class eje3_1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de productos: ");
        int productos = scanner.nextInt();

        for (int i = 1; i <= productos; i++) {
            System.out.print("Cantidad disponible del producto " + i + ": ");
            int cantidad = scanner.nextInt();
            if (cantidad < 5) {
                System.out.println("Producto " + i + " tiene menos de 5 unidades. ¡Es necesario realizar un pedido!");
            }
        }

        scanner.close();
    }
}
