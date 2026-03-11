package cond;

import java.util.Scanner;

public class IfEx5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rating = sc.nextDouble();

        if (rating == 9){
            System.out.println("어바웃 타임즈");
        } else if (rating == 8){
            System.out.println("토이스토리");
        } else if (rating == 7){
            System.out.println("고질라");
        }
    }
}
