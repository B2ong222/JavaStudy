package cond;

import java.util.Scanner;

public class IfEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        int age = sc.nextInt();

        if (money >= 10000){
            money -= 1000;
        }
        if (age <= 10){
            money -= 1000;
        }
        System.out.println(money);
    }
}
