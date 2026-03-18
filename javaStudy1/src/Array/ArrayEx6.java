package Array;

import java.util.Scanner;

public class ArrayEx6 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        int[] numbers = new int[count];

        for (int i = 0; i < count; i ++){
            numbers[i] = sc.nextInt();
        }

        int bigNum = numbers[0];
        int smallNum = numbers[0];

        for (int i = 1; i < count; i++){
            if (numbers[i] > bigNum){
                bigNum = numbers[i];
            }
            if (numbers[i] < smallNum){
                smallNum = numbers[i];
            }
        }
        System.out.println(bigNum);
        System.out.println(smallNum);
    }
}
