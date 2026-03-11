package cond;

import java.util.Scanner;

public class IfEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();

        if (money < 0){
            System.out.println("잘못된 금액");
        } else if (money == 0){
            System.out.println("노 머니");
        } else if (money >= 1){
            System.out.println(money *1473.83+"원입니다.");
        }
    }
}
