package formativeEvaluation;

import java.util.Scanner;

public class seven {
    static void main() {
        int input = new Scanner(System.in).nextInt();
        int input2 = new Scanner(System.in).nextInt();

        if (input > input2){
            for (int i = input; i >= input2; i--){
                for (int j = 1; j <= 9; j++){
                    System.out.println(i + "*" + j + "=" + i*j);
                }
            }
        }
    }
}
