package Scanner;

import java.util.Scanner;

public class ScannerEx4 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        while (true){
            int sc1 = scanner.nextInt();
            int sc2 = scanner.nextInt();
            if (sc1 == 0 & sc2 == 0){
                break;
            }
            System.out.println(sc1 + sc2);
        }
    }
}
