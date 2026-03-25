package formativeEvaluation;

import java.util.Scanner;

public class eight {
    static void main() {
        int input = new Scanner(System.in).nextInt();

        for (int i = 0; i < input; i++){
            for (int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for (int k = input-i; k > 0; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
