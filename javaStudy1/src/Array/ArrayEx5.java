package Array;

import java.util.Scanner;

public class ArrayEx5 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        int[] numbers = new int[count];

        int sum = 0;
        for (int i = 0; i < count; i++){
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }
        System.out.println("합계: " + sum);
        System.out.println("평균: " + sum/count);
    }
}
