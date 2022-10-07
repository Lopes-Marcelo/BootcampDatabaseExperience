import java.util.*;

public class DesafioC{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int num = teclado.nextInt();
        var count = 0;

        for (var i = 1; i <= num; i++){
            var strNum = String.valueOf(i);
            if (strNum.length() == num){
                if (i % 2 == 0){
                    count++;
                }
                continue;
            }
            char[] vs = strNum.toCharArray();
            var sum = 0;
            
            for (var j = 0; j < vs.length; j++){
                sum += (int)Character.getNumericValue(vs[j]);
            }
            if (sum % 2 == 0){
                count++;
            }
        }
        System.out.println(count);

        teclado.close();
    }
}