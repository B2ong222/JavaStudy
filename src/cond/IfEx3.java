package cond;

import java.util.Scanner;

public class IfEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int km = sc.nextInt();

        if (km <= 1){
            System.out.println("도보");
        } else if (km <= 10){
            System.out.println("자전");
        } else if (km <= 100){
            System.out.println("자동차");
        } else {
            System.out.println("비행기");
        }
    }
}
