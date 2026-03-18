package Scanner;

import java.util.Scanner;

public class ScannerEx2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int sc1 = scanner.nextInt();
        int sc2 = scanner.nextInt();

        System.out.println((sc1 >= sc2) ? sc1 : sc2);
    }
}
