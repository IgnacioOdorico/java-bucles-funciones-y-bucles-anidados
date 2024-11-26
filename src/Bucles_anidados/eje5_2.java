/*5. Mostrar un contador de 5 dígitos. En lugar del dígito 3 se debe mostrar E*/
public class eje5_2{
    public static void main(String[] args) {
        for (int i = 0; i <= 99999; i++) {
            String numero = String.format("%05d", i); // Formatea a 5 dígitos

            for (char c : numero.toCharArray()) {
                if (c == '3') {
                    System.out.print('E');
                } else {
                    System.out.print(c);
                }
            }

            System.out.println();
        }
    }
}
