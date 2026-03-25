package formativeEvaluation;

import java.util.Scanner;

public class six {
    static void main() {
        int input = new Scanner(System.in).nextInt();
        int input2 = new Scanner(System.in).nextInt();

        for (int i = 1; i <= input; i++){
            for (int j = 1; j <= input2; j++){
                System.out.print((i + j - 1) + " ");
            }
            System.out.println();
        }
    }
}
