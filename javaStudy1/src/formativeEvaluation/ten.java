package formativeEvaluation;

import java.util.Scanner;

public class ten {
    static void main() {
        int input = new Scanner(System.in).nextInt();

        int num = 1;

        for (int i = 1; i <= input; i++){
            for (int j = 1; j <= input; j++){
                System.out.print(num + " ");
                num += 2;
                if (num > 9) num = 1;
            }
            System.out.println();
        }
    }
}
