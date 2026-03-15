package cond;

import java.util.Scanner;

public class LoopEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int count = 1;
        int n = 0;
        while (count <= input){
            n += count;
            System.out.println(n);
            count++;
        }
        int v = 0;
        for (int i = 1; i <= input; i++){
            v += i;
            System.out.println(v);
        }
    }
}
