import java.util.Scanner;

public class DesafioA{
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        int num = teclado.nextInt();
        var step = 0;

        while( num > 0 ){
            if( num % 2 == 0 ){
                num /= 2;
            }else{
                num--;
            }
            step++;
        }

        if( step > 0 ){
            System.out.println( step );
        }else{
            System.out.println( step );
        }

        teclado.close();
    }
}