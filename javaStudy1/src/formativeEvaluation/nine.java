package formativeEvaluation;

import java.util.Scanner;

public class nine {
    static void main() {
        int input = new Scanner(System.in).nextInt();

        for (int i = 0; i < input; i++){
            for (int j = input - i - 1; j > 0; j--){
                System.out.print(" ");
            }
            for (int k = 1; k <= i+1; k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
