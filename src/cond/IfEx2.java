package cond;

import java.util.Scanner;

public class IfEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int credit = sc.nextInt();

        if (credit >= 90){
            System.out.println("A");
        } else if (credit >= 80){
            System.out.println("B");
        } else if (credit >= 70){
            System.out.println("C");
        } else if (credit >= 60){
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
