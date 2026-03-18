package Array;

import java.util.Scanner;

public class ArrayEx4 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        numbers[0] = sc.nextInt();
        numbers[1] = sc.nextInt();
        numbers[2] = sc.nextInt();
        numbers[3] = sc.nextInt();
        numbers[4] = sc.nextInt();

        int sum = 0;
        for (int i = 0; i < 5; i++){
            sum += numbers[i];
        }
        System.out.println("합계: " + sum);
        System.out.println("평균: " + sum/5);
    }
}
