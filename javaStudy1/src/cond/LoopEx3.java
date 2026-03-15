package cond;

import java.util.Scanner;

public class LoopEx3 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int count1 = sc.nextInt();
        int n = 0;

        while (n<5){
            if (count1%2==0){
                System.out.println(count1);
                count1 += 2;
                n++;
            } else {
                System.out.println(count1 +1);
                count1 += 2;
                n++;
            }
        }

        int count2 = sc.nextInt();
        for (int i= 0; i < 5; i++){
            if (count2%2==0){
                System.out.println(count2);
                count2 += 2;
            } else {
                System.out.println(count2 +1);
                count2 += 2;
            }
        }

    }
}
