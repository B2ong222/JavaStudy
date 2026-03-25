package formativeEvaluation;

import java.util.Scanner;

public class five {
    static void main() {
        int input = new Scanner(System.in).nextInt();
        for (int i = 1; i <= input  ; i++){
            if (i%2==0){
                System.out.print(i + " ");
            } else {
                continue;
            }
        }
    }
}
