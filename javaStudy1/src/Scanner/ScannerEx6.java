package Scanner;

import java.util.Scanner;

public class ScannerEx6 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("당신의 이름을 입력하세요:");
        String str = scanner.nextLine();
        System.out.print("당신의 나이를 입력하세요:");
        int intValue = scanner.nextInt();
        System.out.println("당신의 이름은"+str+"이고, "+intValue+"살입니다.");
    }
}
