package formativeEvaluation;

import java.util.Scanner;

public class three {
    static void main() {
        while (true) {
            int input = new Scanner(System.in).nextInt();

            if (100 >= input & input >= 80){
                System.out.println("합격");
            } else if (80 > input & input >=0){
                System.out.println("불합격");
            } else {
                break;
            }
        }
    }
}
