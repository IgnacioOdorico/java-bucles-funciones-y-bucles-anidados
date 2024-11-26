public class eje1_1 {
    public static void main(String[] args){
        System.out.println("Números perfectos entre 1 y 1000:");

        for (int num = 1; num <= 1000; num++) {
            int sumaDivisores = 0;

            for (int i = 1; i < num; i++) { // Divisores propios
                if (num % i == 0) {
                    sumaDivisores += i;
                }
            }

            if (sumaDivisores == num) { // Verifica si el número es perfecto
                System.out.println(num);
            }
        }
    }
}
