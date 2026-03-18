package Scanner;

import java.util.Scanner;

public class ScannerEx1 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int sc1 = scanner.nextInt();
        int sc2 = scanner.nextInt();
        int sc3 = scanner.nextInt();

        int sum = sc1 + sc2 + sc3;
        System.out.println(sum + ", " + sum/3);

    }
}
