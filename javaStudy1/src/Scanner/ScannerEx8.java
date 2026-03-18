package Scanner;

import java.util.Scanner;

public class ScannerEx8 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        if (num1 < num2){
            for (int i = num1; i <= num2; i++){
                if (i == num2){
                    System.out.print(i);
                } else {
                    System.out.print(i + ",");
                }
            }
        } else {
            for (int i = num2; i <= num1; i++){
                if (i == num1){
                    System.out.print(i);
                } else {
                    System.out.print(i + ",");
                }
            }
        }
    }
}
