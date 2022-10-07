import java.io.IOException;
import java.util.Scanner;

public class DesafioB {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);

        int cod1 = teclado.nextInt();
        int n1 = teclado.nextInt();
        double valor1 = teclado.nextDouble();

        int cod2 = teclado.nextInt();
        int n2 = teclado.nextInt();
        double valor2 = teclado.nextDouble();

        double total = ( (double) n1 * valor1 ) + ( (double) n2 * valor2 );
        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", total));

        teclado.close();
    }
}