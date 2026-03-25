package formativeEvaluation;

import java.util.Scanner;

public class five2 {
    static void main() {
        int input = new Scanner(System.in).nextInt();
        int input2 = new Scanner(System.in).nextInt();

        int sum = 0;

        if (input%3==0 | input%5==0){
            sum += input;
        }
        if (input2%3==0 | input2%5==0){
            sum += input2;
        }
        System.out.println("sum : " + sum);
        System.out.println("avg : " + String.format("%.1f", (double)sum / 2));
    }
}
