package Array;

import java.util.Scanner;

public class ArrayEx3 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        numbers[0] = sc.nextInt();
        numbers[1] = sc.nextInt();
        numbers[2] = sc.nextInt();
        numbers[3] = sc.nextInt();
        numbers[4] = sc.nextInt();

        for (int i = 4; i >= 0 ; i--){
            if (i > 0){
                System.out.print(numbers[i] + ", ");
            } else {
                System.out.print(numbers[i]);
            }
        }
    }
}
