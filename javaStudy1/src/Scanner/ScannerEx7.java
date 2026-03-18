package Scanner;

import java.util.Scanner;

public class ScannerEx7 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("하나의 정수를 입력하세요:");
        int sc1 = scanner.nextInt();

        System.out.println((sc1%2==0) ? "짝수" : "홀수" + "입니다");
    }
}
