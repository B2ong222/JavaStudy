package formativeEvaluation;

import java.util.Scanner;

public class two {
    static void main() {
        int input = new Scanner(System.in).nextInt();
        int input2 = new Scanner(System.in).nextInt();
        System.out.println((input > input2) ? input : input2);
    }
}
