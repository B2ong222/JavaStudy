package cond;

import java.util.Scanner;

public class LoopEx2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int n = 0;
        while (n < 5){
            System.out.println(count+n);
            n++;
        }
        for (int i = 0; i < 5; i++){
            System.out.println(count + i);
        }
    }
}
